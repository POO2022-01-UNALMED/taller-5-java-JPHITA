package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;

	public Anfibio(){
		anfibios++;
	}

	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
		super(nombre, edad, habitat, genero);

		this.colorPiel = colorPiel;
		this.venenoso = venenoso;

		anfibios++;
	}
	
	public static int cantidadAnfibios() {
		return ranas + salamandras;
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static Animal crearRana(String nombre, int edad, String genero) {
		Anfibio animalito = new Anfibio(nombre, edad, "selva", genero, "rojo", true);

		ranas++;
		listado.add(animalito);

		return animalito;
	}
	
	public static Animal crearSalamandra(String nombre, int edad, String genero) {
		Anfibio animalito = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);

		salamandras++;
		listado.add(animalito);

		return animalito;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
}
