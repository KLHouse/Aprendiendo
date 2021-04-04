package EjerciciosCiclos;

import java.util.Scanner;

public class Mayor_Menor_Valor_Arreglo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite el tamano de su arreglo");
		int tamanoArreglo = sc.nextInt();
		
		int[] arreglo = new int[tamanoArreglo];

		System.out.println("Llene su arreglo");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print((i+1)+". Numero: ");
			int numero = sc.nextInt();
			
			arreglo[i]=numero;
		}
		
		int mayor, menor;
		mayor = menor = arreglo[0];
		
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i]>mayor) {
				mayor = arreglo[i];
			}
			if(arreglo[i]<menor) {
				menor = arreglo[i];
			}
		}
		System.out.println("El mayor valor es: "+mayor);
		System.out.println("El menor valor es: "+menor);
	}

}
