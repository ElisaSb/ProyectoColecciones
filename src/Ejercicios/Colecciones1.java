package Ejercicios;

import java.util.Arrays;

public class Colecciones1 {
	//atributo
	private double[] datos;
	//constructor
	public Colecciones1(double[] datos) {
		this.datos = datos;
	}
	@Override
	public String toString() {
		return Arrays.toString(datos);
	}
	public double[] getDatos() {
		return datos;
	}
	public void setDatos(double[] datos) {
		this.datos = datos;
	}	
}
