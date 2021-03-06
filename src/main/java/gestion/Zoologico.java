package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico() {}

	public Zoologico(String nombre, String ubicacion) {
		this.setNombre(nombre);
		this.ubicacion = ubicacion;
	}
	
	public void agregarZonas(Zona nuevaZona) {
		zonas.add(nuevaZona);
		nuevaZona.setZoo(this);
	}
	
	public int cantidadTotalAnimales() {
		int r = 0;
		for (Zona zona : zonas) {
			r += zona.cantidadAnimales();
		}

		return r;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Zona> getZona() {
		return zonas;
	}

	public void setZona(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
}
