package Teoria;

public class Array2 {
	public static void main(String[] args) {
		//definimos un array bidimensional de int
		final int TAMAÑO_FILAS = 3;
		final int TAMAÑO_COLUMNAS = 3;
		int[][] coleccionBidimensionalEnteros = new int[TAMAÑO_FILAS][TAMAÑO_COLUMNAS];
		coleccionBidimensionalEnteros[0][0] = 0;
		coleccionBidimensionalEnteros[0][1] = 1;
		coleccionBidimensionalEnteros[0][2] = 2;
		
		coleccionBidimensionalEnteros[1][0] = 3;
		coleccionBidimensionalEnteros[1][1] = 4;
		coleccionBidimensionalEnteros[1][2] = 5;
		
		coleccionBidimensionalEnteros[2][0] = 6;
		coleccionBidimensionalEnteros[2][1] = 7;
		coleccionBidimensionalEnteros[2][2] = 8;
		//recorremos el array
		for (int i = 0; i < coleccionBidimensionalEnteros.length; i++) {
			for (int j = 0; j < coleccionBidimensionalEnteros[i].length; j++) {
				System.out.println(coleccionBidimensionalEnteros[i][j]);
			}
		}
		System.out.println("*___________________________________________*");
		//cambiamos el bucle
		for (int[] is : coleccionBidimensionalEnteros) {
			for (int i : is) {
				System.out.println(i);
			}			
		}
		System.out.println("*____________________________________________*");
		//ahora creamos la coleccion bidimensional y la inicializamos
		int[][][] coleccionTridimensionalEnteros = {
				{ {1,2}, {3,4} },
				{ {5,6}, {7,8} },
				{ {9,10}, {10,11} }
		};
		//recorrer
		for (int[][] is : coleccionTridimensionalEnteros) {
			for (int[] is2 : is) {
				for (int i : is2) {
					System.out.println(i);
				}
			}
		}
	}
}
