package EjerciciosCiclos;

import javax.swing.JOptionPane;

/*Ejercicio 7: Pedir números hasta que se introduzca uno negativo, y calcular la media.*/
public class PromedioDeNumeros {

	public static void main(String[] args) {
		int numero, elementos=0,suma=0;
		float media;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		
		while(numero>=0) {
			suma += numero;
			elementos++;
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
			
		}

		if(elementos == 0) {
			System.out.println("error, la division entre 0 no existe");
		}
		else {
			media = (float)suma/elementos;
		}
	}

}
