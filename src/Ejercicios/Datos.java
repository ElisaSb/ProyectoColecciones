package Ejercicios;

import java.util.Arrays;

public class Datos {
	//atributos
	private double[] temperaturas;
	//constructor
	public Datos(double[] temperaturas) {
		this.temperaturas = temperaturas;
	}
	//primero método que devuelve el valor medio.
	public double CalcularValorMedio(){
		double suma = 0;
		for (double d : temperaturas) {
			suma += d;
		}
		double valorMedio = suma/(temperaturas.length*1.0);
		return valorMedio;
	}
	//método para calcular la desviacion tipica
	public double calcularDesviacionTipica(){
		//suma (x - valorMedio)^2
		double suma = 0;
		for (double d : temperaturas) {
			suma += Math.pow(d - CalcularValorMedio(), 2);
		}
		double desviacionTipica = Math.sqrt(suma / temperaturas.length);
		return desviacionTipica;
	}
	public int obtenerNumeroValoresPorDebajoMedia(){
		int contador = 0;
		//código
		for (double d : temperaturas) {
			if (d < CalcularValorMedio()) {
				contador++;
			}
		}
		return contador;
	}
	//calcular el max de la temperatura
	public double obtenerMaxTemperatura(){
		double max = temperaturas[0];
		for (double d : temperaturas) {
			if (d > max) {
				max = d;
			}
		}
		return max;
	}
	//calcular el min de la temperatura
		public double obtenerMinTemperatura(){
			double min = temperaturas[0];
			for (double d : temperaturas) {
				if (d < min) {
					min = d;
				}
			}
			return min;
		}
	
	@Override
	public String toString() {
		return Arrays.toString(temperaturas);
	}
	
}
