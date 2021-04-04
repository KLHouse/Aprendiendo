package EjerciciosCiclos;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*Ejercicio 4: Pedir numeros hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introducido.*/

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;

		System.out.println("Digite un numero");
		int numero = sc.nextInt();

		while (numero >= 0) {
			System.out.println("Ha ingresado el numero: " + numero);
			contador++;
			System.out.println("Cantidad de numero digitados: " + contador);
			
			
			System.out.println("Digite otro numero");
			numero = sc.nextInt();
		}
		System.out.println("Ha ingresado un numero invalido");
	}

	}


