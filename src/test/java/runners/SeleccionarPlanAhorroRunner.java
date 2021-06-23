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
        features = "src/test/resources/features/seleccionar_plan_retiro_plan_ahorro.feature",
        glue = {"stepdefinitions"},
        snippets = SnippetType.CAMELCASE,
        tags = {"@metaC"}
)

public class SeleccionarPlanAhorroRunner {
    @BeforeSuite
    public static void test() throws IOException, InvalidFormatException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/seleccionar_plan_retiro_plan_ahorro.feature");
    }

}


