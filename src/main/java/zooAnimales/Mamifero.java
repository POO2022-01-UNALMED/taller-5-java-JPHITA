package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;

	public Mamifero(){
		mamiferos++;
	}

	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
		super(nombre, edad, habitat, genero);

		this.pelaje = pelaje;
		this.patas = patas;

		mamiferos++;
	}

	public void cantidadMamiferos() {
		
	}
	
	public static Animal crearCaballo(String nombre, int edad, String genero) {
		Mamifero animalito = new Mamifero(nombre, edad, "pradera", genero, true, 4);

		caballos++;
		listado.add(animalito);

		return animalito;
	}
	
	public static Animal crearLeon(String nombre, int edad, String genero) {
		Mamifero animalito = new Mamifero(nombre, edad, "selva", genero, true, 4);

		leones++;
		listado.add(animalito);

		return animalito;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
}
