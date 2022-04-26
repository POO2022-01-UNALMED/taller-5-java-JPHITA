package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;

	public Ave(){
		aves++;
	}

	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
		super(nombre, edad, habitat, genero);

		this.colorPlumas = colorPlumas;

		aves++;
	}
	
	public void cantidadAves() {
		
	}

	public String movimiento() {
		return "volar";
	}
	
	public static Animal crearHalcon(String nombre, int edad, String genero) {
		Ave avesita = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");

		halcones++;
		listado.add(avesita);

		return avesita;		
	}
	
	public static Animal crearAguila(String nombre, int edad, String genero) {
		Ave avesita = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");

		aguilas++;
		listado.add(avesita);

		return avesita;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}
