package EjerciciosArreglos;

import java.util.Scanner;
/*Ejercicio 1: Leer 5 números, 
 *guardarlos en un arreglo y 
 *mostrarlos en el orden inverso que ingresaron.*/
public class asa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 5 numeros");
		int[] arregloNumeros = new int[5];

		for (int i = 0; i < 5; i++) {
			int numeros = sc.nextInt();
			arregloNumeros[i] = numeros;

		}
		for (int i = 4; i >= 0; i--) {
			System.out.print(arregloNumeros[i] + " ");
		}
	}
}
