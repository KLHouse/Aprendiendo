package Area_Y_Perimetro_Is�sceles;

/*Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles.
 *Para ello defina los atributos necesarios que se requieren, proporcione métodos de consulta,
 *un método constructor e implemente métodos para calcular el perímetro y el área de un triángulo, 
 *además implementar un método que a partir de un arreglo de triángulos devuelva el área del triángulo de mayor superficie.
*/
public class Triangulo_Isoceles {

	private double lado;
	private double base;

	public Triangulo_Isoceles(double lado, double base) {

		this.lado = lado;
		this.base = base;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	public double calcularArea() {
		double area;
		double altura = Math.sqrt(Math.pow(lado, 2)-(Math.pow(base, 2)/4));
		
		area = (base*altura)/2;
		
		return area;
		
	}
	public double calcularPerimetro() {
		double perimetro;
		
		perimetro=(2*lado)+base;
		
		return perimetro;
	}

}
