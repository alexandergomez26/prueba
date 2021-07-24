package integrations;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static utils.constantes.ConstantesGenerales.*;

public class ConsumirGet implements Task {

    public static ConsumirGet autenticacion() {
        return Tasks.instrumented(ConsumirGet.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.whoCan(CallAnApi.at(BASE_URL_AUTENTICACION));
        actor.attemptsTo(Post.to(GET_AUTENTICACION)
                            .with(request -> request
                                    .header("Content-Type",CONTENT_TYPE)
                                    .param("grant_type", GRANT_TYPE)
                                    .param("Client_id", CLIENT_ID)
                                    .param("client_secret", CLIENT_SECRET)
                                    .param("scope", SCOPE)
                                    .param("resource", RESOURCE)
                                    .relaxedHTTPSValidation()));

        actor.remember("token", SerenityRest.lastResponse().body().jsonPath().get("access_token").toString());
    }

    public static void main(String[] args) {
        ObtenerParametros.tecnicos();
    }
}


