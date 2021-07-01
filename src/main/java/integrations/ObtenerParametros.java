package integrations;

import models.ConsumoDatos;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static Utils.Constants.ConstantesGenerales.BASE_URL_PARAMETROS_TECNICOS;
import static Utils.Constants.ConstantesGenerales.GET_PARAMETROS_TECNICOS;

public class ObtenerParametros implements Task {

    private final ConsumoDatos consumoDatos = new ConsumoDatos();


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ConsumirGet.autenticacion());
        System.out.println("Token Token respuiesta: " + actor.recall("token"));

        actor.whoCan(CallAnApi.at(BASE_URL_PARAMETROS_TECNICOS));
                actor.attemptsTo(
                        Get.resource(GET_PARAMETROS_TECNICOS)
                                .with(request -> request
                                        .header("Authorization", "Bearer " + actor.recall("token"))
                                        .header("ClienteDNI", "CC_123")
                                        .relaxedHTTPSValidation()));

                consumoDatos.setInflacion(SerenityRest.lastResponse().body().jsonPath().get("payload." + "inflacion"));
                consumoDatos.setFactorSeguridad(SerenityRest.lastResponse().body().jsonPath().get("payload." + "factorSeguridad"));
                consumoDatos.setFactorGasto(SerenityRest.lastResponse().body().jsonPath().get("payload." + "factorGasto"));
                consumoDatos.setDeslizamiento(SerenityRest.lastResponse().body().jsonPath().get("payload." + "deslizamiento"));
                consumoDatos.setFactorComision(SerenityRest.lastResponse().body().jsonPath().get("payload." + "factorComision"));
                consumoDatos.setTasaInteresTecnico(SerenityRest.lastResponse().body().jsonPath().get("payload." + "tasaInteresTecnico"));

        actor.remember("consumoDatos", consumoDatos);

        System.out.println("Respuesta: " + SerenityRest.lastResponse().body().prettyPrint());

    }

    public static ObtenerParametros tecnicos(){
        return Tasks.instrumented(ObtenerParametros.class);
    }


}

