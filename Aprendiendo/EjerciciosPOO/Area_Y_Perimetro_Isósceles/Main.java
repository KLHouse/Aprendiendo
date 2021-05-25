package Area_Y_Perimetro_Is�sceles;

import java.util.Scanner;

/*Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles.
 *Para ello defina los atributos necesarios que se requieren, proporcione métodos de consulta,
 *un método constructor e implemente métodos para calcular el perímetro y el área de un triángulo, 
 *además implementar un método que a partir de un arreglo de triángulos devuelva el área del triángulo de mayor superficie.
*/

public class Main {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite los lados del tringulo y su base");
		double lado = sc.nextDouble();
		double base = sc.nextDouble();
		
		Triangulo_Isoceles triangulo1 = new Triangulo_Isoceles(lado, base);
		
		System.out.println(triangulo1.calcularArea());
		System.out.println(triangulo1.calcularPerimetro());
		
		
	}

}
