package CompetenciaAtletismo;

import java.util.Scanner;

/*Ejercicio 4: Construir un programa para una competencia de atletismo,
 *  el programa debe gestionar una serie de atletas caracterizados por
 *   su número de atleta, nombre y tiempo de carrera, al final el
 *    programa debe mostrar los datos del atleta ganador de la carrera.
*/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ID, indice = 0;
		String nombre;
		double tiempoDeCarrera;

		Atletas[] atletas = new Atletas[2];

		for (int i = 0; i < atletas.length; i++) {

			System.out.println("Digite sus datos");
			System.out.print("ID: ");
			ID = sc.nextInt();

			sc.nextLine();
			System.out.print("Nombre: ");
			nombre = sc.nextLine();

			System.out.print("Tiempo de Carrera (Minutos) : ");
			tiempoDeCarrera = sc.nextDouble();
			System.out.println();

			atletas[i] = new Atletas(ID, nombre, tiempoDeCarrera); // Aqui llenamos el arreglo
		}
		indice = atletaMasRapido(atletas);
		System.out.println("El corredor mas rapido fue:");
		System.out.println(atletas[indice].getNombreAtleta());

	}

	public static int atletaMasRapido(Atletas[] atletas) {

		int indice = 0;
		double masRapido = atletas[0].getTiempoCarrera();

		for (int i = 0; i < atletas.length; i++) {
			if (masRapido > atletas[i].getTiempoCarrera()) {
				masRapido = atletas[i].getTiempoCarrera();
				indice = i;
			}
		}

		return indice;

	}

}
