package personajes;

public abstract class Personaje {

	protected String nombre = "SinNombre";
	
	protected int ataque = 0;
	protected int defensa = 0;
	
	protected int vida_maxima = 0;
	protected int vida = 0;
	
	public Personaje(String nombre) {
		this.nombre = nombre;
	}
	
	public Personaje(String nombre, int ataque, int defensa) {
		this(nombre);
		this.ataque = ataque;
		this.defensa = defensa;
	}
	
	public Personaje(String nombre, int ataque, int defensa, int vida_maxima) {
		this(nombre, ataque, defensa);
		this.vida = vida_maxima;
		this.vida_maxima = vida_maxima;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getAtaque() {
		return this.ataque;
	}
	
	public int getDefensa() {
		return this.defensa;
	}
	
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public int getVidaMaxima() {
		return this.vida_maxima;
	}
	
	public void dañar(int daño) {
		this.vida = this.vida - daño;
		if(this.vida < 0) {
			this.vida = 0;
		}
	}
	
	public void curar(int cura) {
		this.vida = this.vida + cura;
		if(this.vida > this.vida_maxima) {
			this.vida = this.vida_maxima;
		}
	}
	
}
