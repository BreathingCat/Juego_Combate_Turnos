package enemigos;

import java.util.ArrayList;

import combate.CombateComponente;
import combate.DecoradorAtaque;
import combate.DecoradorDefensa;
import estrategia.EstrategiaCombate;
import personajes.Jugador;
import personajes.Personaje;

public abstract class Enemigo extends Personaje {

	public Enemigo(String nombre, int ataque, int defensa) {
		super(nombre, ataque, defensa);
	}
	
	public void atacar(Jugador objetivo) {
		CombateComponente ataque = new CombateComponente();
		DecoradorDefensa defensaDecorada = new DecoradorDefensa(ataque);
		DecoradorAtaque ataqueDecorado = new DecoradorAtaque(defensaDecorada);
		
		ataqueDecorado.combate(this, objetivo);
	}
	
	public abstract void usarHabilidadPrimaria();
	
	public abstract void usarHabilidadSecundaria();
	
	public void ejecutarStrategy(EstrategiaCombate estrategia, ArrayList<Personaje> personajesJugador) {
		estrategia.ejecutar(personajesJugador);
	}


}
