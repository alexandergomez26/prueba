package runners;

import Utils.BeforeSuite;
import Utils.exceldata.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(PersonalizedRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/seleccionar_pension_meta_plan_ahorro_plan_retiro.feature",
        glue = {"stepdefinitions"},
        snippets = SnippetType.CAMELCASE,
        tags = "@meta3b"
)

public class SeleccionarPensionMetaPlanAhorroPlanRetiroRunner {
    @BeforeSuite
    public static void test() throws IOException, InvalidFormatException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/iniciar_sesion.feature");
    }

}

