package Teoria;

import java.util.ArrayList;
import java.util.List;

public class Lista2 {
	public static void main(String[] args) {
		//creamos la lista vacia
		List<Integer> listaNumeros = new ArrayList<Integer>();
		System.out.printf("Tamaño de la lista: %d\n", listaNumeros.size());
		listaNumeros.add(3);
		listaNumeros.add(5);
		listaNumeros.add(7);
		System.out.printf("Tamaño de la lista: %d\n", listaNumeros.size());
		System.out.printf("Primer elemento de la lista es: %d\n", listaNumeros.get(0));
		System.out.printf("Último elemento de la lista es: %d\n", listaNumeros.get(listaNumeros.size()-1));
		System.out.printf("%s\n", listaNumeros);
		listaNumeros.add(0, 8);
		System.out.printf("%s\n", listaNumeros);
		listaNumeros.remove(new Integer(5));
		System.out.printf("%s\n", listaNumeros);
		//recorremos la lista
		for (Integer integer : listaNumeros) {
			System.out.println(integer);
		}
		for (Integer integer2 : listaNumeros) {
			System.out.println(integer2*2);
		}
	}

}
