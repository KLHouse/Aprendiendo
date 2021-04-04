package EjerciciosCiclos;

import javax.swing.JOptionPane;

/*Pedir un numero N, y mostrar todos los numeros del 1 al N*/
public class NumerosDel1ALn {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		
		System.out.println("Los numeros del 1 al numero ingresado son: ");
		for (int i = 0; i <= numero; i++) {
			System.out.println(i);
		}

	}

}
