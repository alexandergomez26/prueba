package runners;

import Utils.BeforeSuite;
import Utils.exceldata.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(
        features = "src/test/resources/features/ingreso_edad_definida.feature",
        glue = {"stepdefinitions"},
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" },
        tags = "@BonoModalidad2Mujer"
        //tags = {"@IngresoEdadDefinidaClActualMujer or @IngresoEdadDefinidaClActualHombre"}
)


@RunWith(PersonalizedRunner.class)
public class IngresarEdadDefinidaRunner {
    @BeforeSuite
    public static void test() throws IOException, InvalidFormatException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/ingreso_edad_definida.feature");
    }
    @AfterClass
    public static void finalTest() throws IOException {
        DataToFeature.overwriteOriginalFeature("src/test/resources/features/ingreso_edad_definida.feature");
    }

}
