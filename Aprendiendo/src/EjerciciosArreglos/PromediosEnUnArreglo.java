package EjerciciosArreglos;

import java.util.Scanner;

/*Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo 
 y a continuación realizar la media de los números positivos,
 la media de los negativos y conteo el número de ceros.
*/
public class PromediosEnUnArreglo {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int[] numero = new int[5];
		int contadorPositivos=0, contadorNegativos=0, contadorCeros=0;
		int sumaPositivos = 0, sumaNegativos = 0;
		
		System.out.println("Digite 5 numeros");
		for (int i = 0; i < numero.length; i++) {
			numero[i]=sc.nextInt();
			
			if (numero[i]>0) {
				contadorPositivos++;
				sumaPositivos += numero[i];//Numeros[i] aqui serian solo los postivos, ya que en la sentencia if, solo entran posotivos
				
			}else if(numero[i]<0) {
				contadorNegativos++;
				sumaNegativos += numero[i];//Numeros[i] aqui serian solo los negativos, ya que en la sentencia if, solo entran negativos
			}else {
				contadorCeros++;
			}
			
		}
		System.out.println("La cantidad de numeros positivos son: "+contadorPositivos);
		System.out.println("La media de los numeros positivos es: "+ sumaPositivos/contadorPositivos);
		System.out.println();
		System.out.println("La cantidad de numeros negativos son: "+contadorNegativos);
		System.out.println("La media de los numeros negativos es: "+ sumaNegativos/contadorNegativos);
		System.out.println();
		System.out.println("La cantidad de ceros son: "+contadorCeros);
	}

}
