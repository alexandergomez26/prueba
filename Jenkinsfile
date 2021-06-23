import java.text.SimpleDateFormat
import java.util.Date

pipeline {

  agent { label 'slave_continuous' }

  options{
	    sendSplunkConsoleLog()
	    splunkinsJobOption enableDiagram: true
	    skipDefaultCheckout()
    }

  environment {
    SCM_URL = "https://vostpmde37.proteccion.com.co:10443/CALCULOS_PENSIONALES_DEV/prv-cpr-calculos-web-frontend-certificacion.git"
    SCM_CREDENTIALS = "Master_User"; //Credenciales
    SCM_BRANCH = "master"; //Rama git
    S3_URL = "https://s3.console.aws.amazon.com/s3/buckets/s3devsecopsjenkins01/jobs";
  }



  stages {

    stage('Obtener fuentes'){
      steps{
        sh "git config --global --replace-all http.sslVerify false";
        checkout scm:([$class: 'GitSCM', branches: [[name: "${SCM_BRANCH}"]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: "${SCM_CREDENTIALS}", url: "${SCM_URL}"]]]);
      }
    }



stage('Ejecutar Pruebas'){
      steps{
       script {
             withCredentials([usernamePassword(credentialsId: 'Artifactory-reader', usernameVariable: 'ARTIFACTORY_USER', passwordVariable: 'ARTIFACTORY_PWD')])
             {
          catchError{
                echo "RUNNING CLEAN"
                sh "pwd"
                sh "chmod +x ./src/test/resources/driver/Linux/chromedriver"
                sh "chmod +x gradlew"
                echo "RUNNING TEST"
                sh "./gradlew clean test --tests IngresarApartirEdadDefinidaRunner -i aggregate"

                script {
                  currentBuild.result = 'SUCCESS'
                }
                echo "El resultado de la prueba es : '${currentBuild.result}'"
            }
        }
      }
    }
}


    stage('Generar evidencia'){
            steps{
                catchError{
                    dir("${workspace}"){
                    cucumber failedFeaturesNumber: -1,
                    failedScenariosNumber: -1,
                    failedStepsNumber: -1,
                    fileIncludePattern: 'cucumber-json-report.json',
                    hideEmptyHooks: true,
                    jsonReportDirectory: 'target',
                    pendingStepsNumber: -1,
                    skipEmptyJSONFiles: true,
                    skippedStepsNumber: -1,
                    sortingMethod: 'ALPHABETICAL',
                    undefinedStepsNumber: -1

                    s3Upload consoleLogLevel: 'SEVERE',
                    dontSetBuildResultOnFailure: true,
                    dontWaitForConcurrentBuildCompletion: false,
                    entries:
                    [[bucket: 's3devsecopsjenkins01',
                    excludedFile: '',
                    flatten: true,
                    gzipFiles: false,
                    keepForever: true,
                    managedArtifacts: true,
                    noUploadOnFailure: false,
                    selectedRegion: 'us-east-1',
                    showDirectlyInBrowser: true,
                    sourceFile: 'target/cucumber-html-report/*']],
                    pluginFailureResultConstraint: 'UNSTABLE',
                    profileName: 'S3-Reportes-QA',
                    userMetadata: []
                    }
                }

                script {
                    echo "Los resultados de la ejecución los puede encontrar en la siguiente URL:"
                    intTestURL = env.BUILD_URL + "cucumber-html-reports/overview-features.html"
                    echo intTestURL
                    echo "Los resultados de la publicacion del reporte:"
                    s3FullUrl = "${S3_URL}/${JOB_NAME}/${BUILD_ID}"
                    echo s3FullUrl
                }
            }
        }


  }


}


