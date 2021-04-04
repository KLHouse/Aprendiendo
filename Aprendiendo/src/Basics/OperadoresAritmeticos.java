package Basics;

import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2, suma, resta, div, multipli;
		System.out.println("Digite el primero numero: ");
		numero1 = entrada.nextInt();
		System.out.println("Digite el segundo numero: ");
		numero2= entrada.nextInt();
		
		suma = numero1+numero2;
		System.out.println("La suma es: "+suma);

		resta = numero1-numero2;
		System.out.println("La resta es: "+resta);
		
		div = numero1/numero2;
		System.out.println("La division es :"+div);
		
		multipli = numero1*numero2;
		System.out.println("La multiplacacion es :"+multipli);
	}

}
