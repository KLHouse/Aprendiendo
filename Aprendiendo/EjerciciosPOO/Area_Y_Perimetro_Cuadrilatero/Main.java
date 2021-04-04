package Area_Y_Perimetro_Cuadrilatero;

import java.util.Scanner;

/*Ejercicio 1: Construir un programa que calcule el área y el perímetro de un cuadrilátero dada la longitud de sus dos lados. 
 *Los valores de la longitud deberán introducirse por línea de ordenes. 
 *Si es un cuadrado, sólo se proporcionará la longitud de uno de los lados al constructor.*/
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Cuadrilatero cuadrilatero;
		
		System.out.println("Introduzca 2 numeros, que son los lados");
		float lado2 = s.nextFloat();
		float lado1 = s.nextFloat();
		
		

		if (lado1 == lado2) { //Es un cuadrado
			cuadrilatero = new Cuadrilatero(lado1);
		} else { //Es un cruadrilatero
			cuadrilatero = new Cuadrilatero(lado1, lado2);
		}

		System.out.println("El perimetro es: "+cuadrilatero.getPerimetro());
		System.out.println("El area es: "+cuadrilatero.getArea());
	}

}
