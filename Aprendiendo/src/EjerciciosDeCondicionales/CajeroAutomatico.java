package EjerciciosDeCondicionales;

import javax.swing.JOptionPane;

/*Ejercicio 13: Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares, con el siguiente menú de opciones:

1. Ingresar dinero a la cuenta.
2. Retirar dinero de la cuenta.
3. Salir*/

public class CajeroAutomatico {

	public static void main(String[] args) {
		
		final double saldoInicial = 1000;
		double saldoTotal;
		double dineroAIngresar;
		double dineroARetirar;
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite una opcion: Opcion 1: Ingresar dinero a la cuenta\n"
				+ "Opcion 2: Retirar dinero\n"
				+"Opcion 3: Salir"));
		
		switch(opcion) {
		
		case 1: dineroAIngresar=Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero desea ingresar"));
		saldoTotal=saldoInicial+dineroAIngresar;
		JOptionPane.showMessageDialog(null, "Su dinero se ha ingresado con exito. Su saldo actual es:"+saldoTotal);
		break;
		
		case 2: dineroARetirar=Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero desea retirar"));
		if (dineroARetirar>saldoInicial) {
			JOptionPane.showMessageDialog(null, "Error, no cuenta con el saldo suficiente");
		}
		else{saldoTotal=saldoInicial-dineroARetirar;
		JOptionPane.showMessageDialog(null, "Su dinero se ha retirado con exito. Su saldo actual es:"+saldoTotal);
		}
		break;
		
		case 3: break;
		
		default: JOptionPane.showMessageDialog(null, "Digite una opcion valida");
		
		
		
		}

	}

}
