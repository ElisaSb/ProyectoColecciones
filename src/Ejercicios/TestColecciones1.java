package Ejercicios;

import java.util.Arrays;

public class TestColecciones1 {

	public static void main(String[] args) {
		double[] datos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		Colecciones1 c1 = new Colecciones1(datos);
		System.out.println(c1);
		//Asigna el valor 5 al último elemento.
		c1.getDatos()[c1.getDatos().length - 1] = 5;
		System.out.println(c1);
		/*Asigna el resto de valores con un bucle que el primer elemento sea 3 y los
		restantes el doble del anterior (el último elemento debe mantener el valor
				5).*/
		for (int i = 0; i < datos.length-1; i++) {
			if (i == 0){
				c1.getDatos()[0] = 3;
			}
			else {
				c1.getDatos()[i]=c1.getDatos()[i-1]*2;
			}
		}
		System.out.println(c1);
		//Mediante un bucle calcula la suma de todos los elementos del array.
		double suma = 0;
		for (double d : datos) {
			suma += d;
		}
		System.out.printf("La suma de los valores del array: %.2f\n", suma);
		//Cambia el valor del array y divide por 3 todos los último cinco valores.
		for (int i=c1.getDatos().length-5;i<c1.getDatos().length;i++) {
			c1.getDatos()[i] = c1.getDatos()[i]/3.0;
		}
		System.out.println(c1);
		//Calcula ahora el valor mas pequeño almacenado en el array.
		double menor = c1.getDatos()[0];
		for (double d : datos) {
			if (d < menor) {
				menor = d;
			}
		}
		System.out.printf("El valor más pequeño: %.2f\n", menor);
		//hacerlo con copia
		double[] copia = c1.getDatos().clone();
		Arrays.sort(c1.getDatos());
		System.out.printf("El número más pequeño es %f\n", c1.getDatos()[0]);
		//imprimir el array original en cuatro columnas
		int contador = 1;
		for (double d : copia) {
			System.out.printf("%8.2f", d);
			if (contador % 4 == 0) {
				System.out.println();				
			}
			contador++;
		}
		//Muestra todos los valores en tres las de cuatro columnas, con una separación de cinco espacios.
	}
}
