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
        features = "src/test/resources/features/ingresar_datos_del_afiliado.feature",
        glue = {"stepdefinitions"},
        snippets = SnippetType.CAMELCASE,
        tags = "@IngDatosAfiClienteActual"
                )
@RunWith(PersonalizedRunner.class)
public class IngresarDatosAfiliadoRunner {
    @BeforeSuite
    public static void test() throws IOException, InvalidFormatException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/ingresar_datos_del_afiliado.feature");
    }

}

