package zooAnimales;

import gestion.Zona;

public class Animal {
	private static int totalAnimales;

	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;

	protected static int aves;
	protected static int anfibios;
	protected static int mamiferos;
	protected static int peces;
	protected static int reptiles;

	
	public Animal() {}

	public Animal(String nombre, int edad, String habitat, String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);

		totalAnimales++;
	}
	
	public String movimiento(){
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: "+mamiferos+"\n" + 
		"Aves: "+aves+"\n" + 
		"Reptiles: "+reptiles+"\n" + 
		"Peces: "+peces+"\n" + 
		"Anfibios: "+anfibios;
	}
	
	public String toString() {
		return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
}
