package EjerciciosArreglos;

import java.util.Scanner;

/*Ejercicio 1: Leer 5 números, 
 *guardarlos en un arreglo y 
 *mostrarlos en el mismo orden que ingresaron.*/
public class Digitar5Numeros_Y_MostrarlosEnOrden {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 5 numeros");
		int[] arregloNumeros = new int[5];

		for (int i = 0; i < 5; i++) {
			int numeros = sc.nextInt();
			arregloNumeros[i] = numeros;
			
		}
		for (int i = 0; i < arregloNumeros.length; i++) {
			System.out.print(arregloNumeros[i]+", ");
		}
	}

}
