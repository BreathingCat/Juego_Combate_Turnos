package estrategia;

import java.util.ArrayList;

import enemigos.Enemigo;
import personajes.Personaje;

public class EstrategiaOso extends EstrategiaCombate {

	public EstrategiaOso(Enemigo componente) {
		super(componente);
	}

	public void ejecutar(ArrayList<Personaje> personajesJugador) {
		System.out.println("ROAR que en idioma oso el que tal la tarde xd mis panas");
		
	}

}
