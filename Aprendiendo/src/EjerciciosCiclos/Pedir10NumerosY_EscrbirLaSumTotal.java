package EjerciciosCiclos;

import java.util.Scanner;

public class Pedir10NumerosY_EscrbirLaSumTotal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 10 numeros");
		int suma = 0;

		for (int i = 0; i <10; i++) {
			int numero = sc.nextInt();
			suma+=numero;
		}
		System.out.println("La suma de los numeros ingresados es de: "+suma );
	}

}
