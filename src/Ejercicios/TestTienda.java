package Ejercicios;

import java.util.Scanner;

public class TestTienda {
	public static void main(String[] args) {
		System.out.println("Introduce tres productos");
		Scanner in = new Scanner(System.in);
		int identificador1 = in.nextInt();
		String nombre1 = in.next();
		double precio1 = in.nextDouble();
		int identificador2 = in.nextInt();
		String nombre2 = in.next();
		double precio2 = in.nextDouble();
		int identificador3 = in.nextInt();
		String nombre3 = in.next();
		double precio3 = in.nextDouble();
		in.close();
		Producto p1 = new Producto(identificador1, nombre1, precio1);
		Producto p2 = new Producto(identificador2, nombre2, precio2);
		Producto p3 = new Producto(identificador3, nombre3, precio3);
		System.out.println(p1+"\n"+p2+"\n"+p3);
		Tienda tienda = new Tienda();
		tienda.insertarProducto(p1);
		tienda.insertarProducto(p2);
		tienda.insertarProducto(p3);
		System.out.println(tienda);
	}
}
