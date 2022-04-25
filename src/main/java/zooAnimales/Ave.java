package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private ArrayList<Ave> listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;

	public Ave(){}

	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
		super(nombre, edad, habitat, genero);

		this.colorPlumas = colorPlumas;
	}
	
	public void cantidadAves() {
		
	}

	public void movimiento() {
		
	}
	
	public void crearHalcon() {
		
	}
	
	public void crearAguila() {
		
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}
