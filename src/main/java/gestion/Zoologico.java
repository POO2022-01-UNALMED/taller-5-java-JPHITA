package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico() {}

	public Zoologico(String nombre, String ubicacion) {
		this.setNombre(nombre);
		this.ubicacion = ubicacion;
	}
	
	public void agregarZonas(Zona nuevaZona) {
		zonas.add(nuevaZona);
	}
	
	public int cantidadTotalAnimales() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
