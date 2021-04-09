package Area_Poligonos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Poligono> poligonos = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//llenar poligono
		llenarPoligonos();
		
		//mostrar los datos y el area de cada poligono
		for (Poligono poli : poligonos) {
			System.out.println(poli.toString());
			System.out.println("Area: "+poli.area());
			System.out.println("");
		}
		

	}

	public static void llenarPoligonos() {

		int opcion;
		char respuesta;

		do {

			do {
				System.out.println("Digite que poligono desea");
				System.out.println("1. Triangulo");
				System.out.println("2. Rectangulo");
				System.out.println("Opcion: ");
				opcion = sc.nextInt();

			} while (opcion < 1 || opcion > 2);

			switch (opcion) {
			case 1:// llenar un triangulo
				llenarTriangulo();
				break;

			case 2: // llenar un rectangulo
				llenarRectangulo();
				break;
			}

			System.out.println("\nDesea introducir otro poligono (s/n)");
			respuesta = sc.next().charAt(0);
			System.out.println();

		} while (respuesta == 's' || respuesta == 'S');
	}

	public static void llenarTriangulo() {

		double lado1, lado2, lado3;

		System.out.println("\nDigite el lado uno del triangulo");
		lado1 = sc.nextDouble();
		System.out.println("\nDigite el lado dos del triangulo");
		lado2 = sc.nextDouble();
		System.out.println("\nDigite el lado tres del triangulo");
		lado3 = sc.nextDouble();

		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		poligonos.add(triangulo);
		
	}
	public static void llenarRectangulo() {
		double lado1,lado2;
		
		System.out.println("\nDigite el lado uno del rectangulo");
		lado1 = sc.nextDouble();
		System.out.println("\nDigite el lado dos del rectangulo");
		lado2 = sc.nextDouble();
		
		Rectangulo rectangulo = new Rectangulo(lado1, lado2);
		poligonos.add(rectangulo);
	}

}
