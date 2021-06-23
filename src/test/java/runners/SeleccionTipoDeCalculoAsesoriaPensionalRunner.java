package runners;

import Utils.BeforeSuite;
import Utils.exceldata.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;


@CucumberOptions(
        features = "src/test/resources/features/seleccion_tipo_de_calculo_asesoria_pensional.feature",
        glue = {"stepdefinitions"},
        snippets = SnippetType.CAMELCASE,
        tags = "@SeleccionAsesoriaGeneralClPotencialBeneficiario"
)
@RunWith(PersonalizedRunner.class)
public class SeleccionTipoDeCalculoAsesoriaPensionalRunner {

    @BeforeSuite
    public static void test() throws IOException, InvalidFormatException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/seleccion_tipo_de_calculo_asesoria_pensional.feature");
    }

}