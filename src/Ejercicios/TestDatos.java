package Ejercicios;

public class TestDatos {

	public static void main(String[] args) {
		double [] temperaturas = {11, 12, -3, 4, 5.5, 6, 7};
		Datos d = new Datos(temperaturas);
		System.out.println(d);
		System.out.printf("Valor medio de las temperaturas: %.2f\n", d.CalcularValorMedio());
		System.out.printf("Desviaci�n t�pica: %.2f\n", d.calcularDesviacionTipica());
		System.out.printf("Valores por debajo de la media: %d\n", d.obtenerNumeroValoresPorDebajoMedia());
		System.out.printf("Valor de temperatura m�ximo: %.2f\n", d.obtenerMaxTemperatura());
		System.out.printf("Valor de temperatura m�nimo: %.2f\n", d.obtenerMinTemperatura());
		
	}
}
