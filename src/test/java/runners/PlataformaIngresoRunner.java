package runners;

import utils.BeforeSuite;
import utils.exceldata.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import java.io.IOException;

@CucumberOptions(
        features = "src/test/resources/features/plataforma_ingreso.feature",
        glue = {"stepdefinitions"},
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        tags = {"@desarrolladorFullStack"}
)

@RunWith(PersonalizedRunner.class)
public class PlataformaIngresoRunner {

    @BeforeSuite
    public static void test() throws IOException, InvalidFormatException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/plataforma_ingreso.feature");
    }
    @AfterClass
    public static void finalTest() throws IOException {
        DataToFeature.overwriteOriginalFeature("src/test/resources/features/plataforma_ingreso.feature");
    }
}
