package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	private List<Producto> listaProductos;
	
	//constructor genera una lista vacía
	public Tienda() {
		this.listaProductos = new ArrayList<Producto>();
	}
	public boolean insertarProducto(Producto p){
		return listaProductos.add(p);
	}
	public boolean eliminarProducto(Producto p){
		return listaProductos.remove(p);
	}
	//get
	public List<Producto> getListaProductos() {
		return listaProductos;
	}
	//obtener el producto más caro 
	public Producto obtenerProductoMasCaro(){
		Producto productoMasCaro = listaProductos.get(0);
		for (Producto producto : listaProductos) {
			if (producto.getPrecioProducto() > productoMasCaro.getPrecioProducto()){
				productoMasCaro = producto;				
			}
		}
		return productoMasCaro;
	}
	//obtener el producto más barato 
	public Producto obtenerProductoMasBarato(){
		Producto productoMasBarato = listaProductos.get(0);
		for (Producto producto : listaProductos) {
			if (producto.getPrecioProducto() < productoMasBarato.getPrecioProducto()){
				productoMasBarato = producto;				
			}
		}
		return productoMasBarato;
	}
	@Override
	public String toString() {
		return "Tienda [listaProductos=" + listaProductos + "]";
	}
}
