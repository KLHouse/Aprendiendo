package EjerciciosArreglos;

public class Mezclar_dos_arreglos {

	public static void main(String[] args) {
		int[] Impares = {1,3,5,7,9,11,13,15,17,19};
		int[] Pares = {2,4,6,8,10,12,14,16,18,20};
		int[] Numeros = new int[Impares.length+Pares.length];
		
		//Ahora vamos a mezclar los 2 arreglos en el arreglo numeros
		//vamos a utilizar el iterador i para Impares y Pares
		//y el iterador j para el arreglo numeros
		int j=0;
		for (int i = 0; i < 10; i++) {//Hasta 10 porque el iterador i controla impares y pares
			Numeros[j]=Impares[i];//Aqui añadimos el primer numero de Impares a Numeros
			j++;//Aqui subimos el iterador j para que salte al campo 2
			// Ya que el iterador j subio, podemos añadir en el siguiente campo la primera posicion de Pares
			Numeros[j]=Pares[i];
			j++; //Aqui saltamos a su campo numero 3, y el ciclo se reinicia y se vuelve a añadir el segundo elemento de Impares y despues e Pares
		}
		System.out.println("El tercer arreglo tiene los elementos: ");
		for (int i = 0; i < Numeros.length; i++) {
			System.out.println(Numeros[i]);
		}
	}

}
