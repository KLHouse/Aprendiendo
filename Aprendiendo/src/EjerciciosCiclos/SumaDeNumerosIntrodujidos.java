package EjerciciosCiclos;

import java.util.Scanner;

public class SumaDeNumerosIntrodujidos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite un numero");
		int numero = sc.nextInt();
		int contador = 0;
		int suma=0;
		
		while (numero != 0) {
			contador++;
			System.out.println("Su cantidad de numeros digitados: "+contador);
			
			suma +=numero;
			System.out.println("Digite otro numero");
			numero = sc.nextInt();
			
		}
		
		System.out.println("La suma de los numeros digitados es: "+suma);

	}

}
