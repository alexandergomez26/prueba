package interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Espera implements Interaction{
	private int miliSegundos;
	
	public Espera(int miliSegundos) {
		this.miliSegundos=miliSegundos;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		new InternalSystemClock().pauseFor(miliSegundos);	
	}
	
	public static Espera cantidadDeMiliSegundos(int miliSegundos) {
		return Tasks.instrumented(Espera.class, miliSegundos);
	}	
}