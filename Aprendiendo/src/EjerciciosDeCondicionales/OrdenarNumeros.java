package EjerciciosDeCondicionales;

import java.util.Scanner;

/* Pedir tres números y mostrarlos ordenados de mayor a menor.*/
public class OrdenarNumeros {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numeroMayor;
		int numeroDeMedio;
		int numeroMenor;
		
		System.out.println("Digite el primer numero");
		int numero1 = entrada.nextInt();
		
		System.out.println("Introdusca el segudno numero");
		int numero2 = entrada.nextInt();
		
		System.out.println("Introdusca el tercer numero");
		int numero3 = entrada.nextInt();

		
		if (numero1<numero2 && numero2<numero3) {
			numeroMayor = numero3;
			numeroDeMedio=numero2;
			numeroMenor=numero1;
			System.out.println("El orden es: "+numeroMayor+" "+numeroDeMedio+" "+numeroMenor);
		}
		else if(numero1<numero2 && numero2>numero3 && numero1>numero3) {
			numeroMayor=numero2;
			numeroDeMedio=numero1;
			numeroMenor=numero3;
			System.out.println("El orden es: "+numeroMayor+" "+numeroDeMedio+" "+numeroMenor);
			
		}else if (numero3>numero1 && numero3>numero2 && numero1>numero2 ) {
			numeroMayor=numero3;
			numeroDeMedio=numero1;
			numeroMenor=numero2;
			System.out.println("El orden es: "+numeroMayor+" "+numeroDeMedio+" "+numeroMenor);
		}else if (numero1>numero2 && numero2>numero3) {
			numeroMayor=numero1;
			numeroDeMedio=numero2;
			numeroMenor =numero3;
			System.out.println("El orden es: "+numeroMayor+" "+numeroDeMedio+" "+numeroMenor);
		}else if (numero1>numero2 && numero3>numero2 && numero1>numero3) {
			numeroMayor=numero1;
			numeroDeMedio= numero3;
			numeroMenor=numero2;
			
			System.out.println("El orden es: "+numeroMayor+" "+numeroDeMedio+" "+numeroMenor);
		}
	}

}
