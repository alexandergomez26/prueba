package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/seleccion_tipo_de_calculo_pension_vejez.feature",
        glue = {"stepdefinitions"},
        snippets = SnippetType.CAMELCASE,
        tags = "@SeleccionPensionVejezClActual"
)
public class SeleccionTipoDeCalculoPensionVejezRunner {
}
