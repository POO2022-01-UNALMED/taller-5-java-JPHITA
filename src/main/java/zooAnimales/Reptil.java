package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private ArrayList<Reptil> listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;

	public Reptil(){}

	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
		super(nombre, edad, habitat, genero);

		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	
	public void contidadReptiles() {
		
	}
	
	public void movimiento() {
		
	}
	
	public void crearIguana() {
		
	}
	
	public void crearSerpiente() {
		
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}
