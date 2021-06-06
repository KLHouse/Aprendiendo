package EjerciciosArreglos;

import java.util.Scanner;

/*Ejercicio 7: Leer por teclado una serie de 10 números enteros. 
 * La aplicación debe indicarnos si los números están ordenados 
 * de forma creciente, decreciente, o si están desordenados.
 * */
public class Arreglo_En_Forma_Creciente_O_decreciente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeros[] = new int[10];
		System.out.println("Digite 4 numeros");
		boolean caso1 = false;
		boolean caso2 = false;

		for (int i = 0; i < 10; i++) {
			numeros[i] = sc.nextInt();

		}
		for (int i = 0; i < 9; i++) {// arreglo no tiene el elemento 10, por eso no lo podemos dejar en 10
			if (numeros[i] < numeros[i + 1]) {// Creciente: 1-2-3-4
				caso1 = true;
			}
			if (numeros[i] > numeros[i + 1]) {// decreciente: 5-4-3-2
				caso2 = true;
			}
			
		}
		if (caso1 == true && caso2 == false) {
			System.out.println("Forma creciente");
		} else if (caso2 == true && caso1 == false) {
			System.out.println("Forma decreciente");
		}else if(caso2 == true && caso1 == true) {
			System.out.println("Desordenado");
		}else if(caso1 == false && caso2 == false) {
			System.out.println("Todos son iguales");
		}
		sc.close();

	}

}
