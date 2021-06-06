package Encontrar_El_Vehiculo_Mas_Barato;

import java.util.Scanner;

/*Ejercicio 3: Construir un programa que dada una
  serie de vehículos caracterizados por su marca,
  modelo y precio, imprima las propiedades del vehículo más barato.
  Para ello, se deberán leer por teclado las características de cada 
  vehículo y crear una clase que represente a cada uno de ellos.*/

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String marca, modelo ;
		double precio;
		int indiceBarato;
		
		System.out.println("Introduzca su cantidad de vehiculos");
		int cantidadVehiculos = sc.nextInt();
		
		Vehiculo[] vehiculos = new Vehiculo[cantidadVehiculos];//Aqui creamos la cantidad de vehiculos que el usuario quiere
		sc.close();
		
		for (int i = 0; i < cantidadVehiculos; i++) {
			sc.nextLine();
			System.out.println("\nDigite las caracteristicas");
			System.out.print("Introduzca la marca del vehiculo numero " +(i+1)+": ");
			marca = sc.nextLine();
			
			System.out.print("Introduzca el modelo del vehiculo numero "+(i+1)+": ");
			modelo = sc.nextLine();
			
			System.out.print("Intoduzca el precio del  vehiculo numero "+(i+1)+": ");
			precio = sc.nextDouble();
			
			vehiculos[i] = new Vehiculo(marca, modelo, precio); //Aqui rellenamos el arreglo
		}
		
		indiceBarato = indiceVehiculoMasBarato(vehiculos);
		
		System.out.println("El coche mas barato es: ");
		System.out.println(vehiculos[indiceBarato].toString());
		
	}
	
	public static int indiceVehiculoMasBarato(Vehiculo[] vehiculos) {// nos tiene que retornar el indice del vehiculo mas barato, por eso int
	
		double precio;
		int indice = 0;
		precio = vehiculos[0].getPrecio();
		
				
		for (int i = 0; i < vehiculos.length; i++) {
			if ( vehiculos[i].getPrecio()<precio) {//por ejemplo precio = 200, es 200 mayor a 50, si
				precio = vehiculos[i].getPrecio();//entonces precio coge el valor de 50
				indice = i;						// y aqui e da la posicio del carro de 50
			}
		}
		return indice;
		
	}
	

}
