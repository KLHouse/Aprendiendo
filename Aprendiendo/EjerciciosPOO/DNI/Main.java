package DNI;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite su nombre");
		String nombre = sc.nextLine();
		
		System.out.println("Digite su edad");
		int edad = sc.nextInt();
		
		System.out.println("Digite su sexo H/F");
		char sexo = sc.next().charAt(0);
		
		System.out.println("Digite su peso");
		double peso = sc.nextDouble();
		
		System.out.println("Digite su altura");
		int altura = sc.nextInt();
		
		
		Persona persona1 = new Persona(nombre, edad, generarDNI(), sexo, peso, altura);
		Persona persona2 = new Persona(nombre, edad, generarDNI(), sexo);
		Persona persona3 = new Persona();
		
		persona1.calcularIMC();
		persona1.esMayorDeEdad();
		if (persona1.esMayorDeEdad()) {
			System.out.println("Usted es mayor de edad");
		}
		System.out.println(persona1.toString());
	}
	public static int generarDNI() {
		Random ram = new Random(System.nanoTime());
		int DNI = ram.nextInt(99999999);
		return DNI;
	}

}
