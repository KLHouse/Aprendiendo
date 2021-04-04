package Basics;
/*Para introducir una variable por consola, se una la clase Scanner pero para ello hay que llamar a la biblioteca*/

import java.util.Scanner;
import javax.swing.JOptionPane;
public class EntradaDeDtos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		double numero1;
		String cadena;
		char letra;
		
		System.out.println("Digite un numero entero");
		numero= entrada.nextInt();
		
		System.out.println("Digite un numero double");
		numero1 = entrada.nextDouble();
		
		System.out.println("Digite una palabra");
		//cadena = entrada.next(); /*El next() solo te guarda una cadena pero hasta que encuentre un espacio, significa que solo guarda una palabra*/
		cadena = entrada.nextLine();
		
		System.out.println("Digite un char");
		letra = entrada.next().charAt(0); /*El charAt(0) solo guarda el primero digito, es decir si introducimos hola, solo nos guardara la h*/
		
		
		
		
		System.out.println("El numero entero es: " +numero);
		System.out.println("El numero double es: " +numero1);
		System.out.println("La cadena es "+cadena);
		System.out.println("La letra es:  ");
		
	

	}

}
