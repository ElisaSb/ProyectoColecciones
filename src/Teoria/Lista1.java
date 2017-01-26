package Teoria;

import java.util.ArrayList;
import java.util.List;

public class Lista1 {
	public static void main(String[] args) {
		//creamos la lista vacia
		//sin parametrizar
		//List listaCadenas = new ArrayList();
		//parametrizada
		List<String> listaCadenas = new ArrayList<String>();
		System.out.printf("Tamaño de la lista: %d\n", listaCadenas.size());
		listaCadenas.add("Joaquín");
		listaCadenas.add("Fernando");
		listaCadenas.add("Luis");
		System.out.printf("Tamaño de la lista: %d\n", listaCadenas.size());
		System.out.printf("Primer elemento de la lista es: %s\n", listaCadenas.get(0));
		System.out.printf("Último elemento de la lista es: %s\n", listaCadenas.get(listaCadenas.size()-1));
		System.out.printf("%s\n", listaCadenas);
		listaCadenas.add(0, "Rodrigo");
		System.out.printf("%s\n", listaCadenas);
		listaCadenas.remove(0);
		System.out.printf("%s\n", listaCadenas);
		listaCadenas.remove("Luis");
		System.out.printf("%s\n", listaCadenas);
		//recorremos la lista
		for (String string : listaCadenas) {
			System.out.println(string);
		}
	}

}
