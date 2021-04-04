package EjerciciosCiclos;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*Ejercicio 1: 
 * Leer un número y mostrar su cuadrado, repetir el proceso 
 * hasta que se introduzca un número negativo.*/
public class CuadradosDeNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite un numero para sacar su cuadrado");
		double numero = sc.nextDouble();
		
		
		
		do {
			if (numero<0) {
				System.out.println("Digite un numero mayor a 0");
			}
			else {
				double cuadrado = Math.pow(numero, 2);
				System.out.println("El cuadrado de su numero es: "+cuadrado);
				System.out.println();
				System.out.println("Digite otro numero");
				numero = sc.nextDouble(); //con esta linea evito que el ciclo sea infinito, ya que tengo que poner otro digito antes de que comince la siguiente 
				
			}
		} while (numero>0);
	

	}

}
