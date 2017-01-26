package Ejercicios;

public class Producto {
	//atributos
	private int identificador;
	private String nombreProducto;
	private double precioProducto;
	//constructor
	public Producto(int identificador, String nombreProducto, double precioProducto) {
		this.identificador = identificador;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
	}
	//getters
	public int getIdentificador() {
		return identificador;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public double getPrecioProducto() {
		return precioProducto;
	}
	//toString
	@Override
	public String toString() {
		return "Producto [identificador=" + identificador + ", nombreProducto=" + nombreProducto + ", precioProducto="
				+ precioProducto + "]";
	}
	//creamos un método main para probar la clase
	/*public static void main(String[] args) {
		Producto p = new Producto(1, "Producto ejemplo", 100.23);
		System.out.println(p);
	}*/
}
