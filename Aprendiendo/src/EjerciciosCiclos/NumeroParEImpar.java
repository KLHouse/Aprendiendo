package EjerciciosCiclos;

/*Ejercicio 3: Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.*/

import javax.swing.JOptionPane;

public class NumeroParEImpar {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		
		while(numero!=0) {//mientra el numero sea diferente a 0
			if (numero%2==0) {
				System.out.println("El numero "+numero+" es par");
			} else {
				System.out.println("El numero "+numero+" es impar");
			}
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
		}
		

	}

}
