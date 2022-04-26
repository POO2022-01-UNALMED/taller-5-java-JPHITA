package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;

	public Pez(){
		peces++;
	}

	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
		super(nombre, edad, habitat, genero);

		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;

		peces++;
	}
	
	public void cantidadPeces() {
		
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static Animal crearSalmon(String nombre, int edad, String genero) {
		Pez pececito = new Pez(nombre, edad, "oceano", genero, "rojo", 6);

		salmones++;
		listado.add(pececito);

		return pececito;
	}
	
	public static Animal crearBacalao(String nombre, int edad, String genero) {
		Pez pececito = new Pez(nombre, edad, "oceano", genero, "gris", 6);

		bacalaos++;
		listado.add(pececito);

		return pececito;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
}
