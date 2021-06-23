package runners;

import Utils.BeforeSuite;
import Utils.exceldata.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(
        features = "src/test/resources/features/ingresar_doble_asesoria.feature",
        glue = {"stepdefinitions"},
        snippets = SnippetType.CAMELCASE,
        tags = "@IngresoClActualDA"
)

@RunWith(PersonalizedRunner.class)
public class IngresarDobleAsesoriaRunner {
    @BeforeSuite
    public static void test() throws IOException, InvalidFormatException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/ingresar_doble_asesoria.feature");
    }

}
