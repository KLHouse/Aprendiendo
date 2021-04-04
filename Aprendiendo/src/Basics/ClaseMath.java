package Basics;
import java.util.Scanner;

public class ClaseMath {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		//Sacar la raiz cuadrada
		double raiz = Math.sqrt(9);
		int raiz2 = (int) Math.sqrt(9);// Asi se convierte un double a un int, ya que el metodo math.sqrt solo acepta doubles
		
		//potencia
		
		System.out.println("Intraduce la base y el exponente");
		double base = entrada.nextDouble();
		double exponente = entrada.nextDouble();
		
		double resultado = Math.pow(base, exponente);
		
		//redondear un numero
		double numero = 4.66;
		double resultado2 = Math.round(numero);
		
		//numero random
		double numero2 = Math.random(); 
		
	}

}
