package runners;

import Utils.BeforeSuite;
import Utils.exceldata.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(
        features = "src/test/resources/features/seleccionar_regimen_prima_media.feature",
        glue = {"stepdefinitions"},
        snippets = SnippetType.CAMELCASE,
        tags = "@RPMClActualMujer"
)
@RunWith(PersonalizedRunner.class)
public class SeleccionarRegimenPrimaMediaRunner {

    @BeforeSuite
    public static void test() throws IOException, InvalidFormatException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/seleccionar_regimen_prima_media.feature");
    }

}