package CajeroAutomatico;

import java.util.Scanner;

public class Cajero {

	Scanner sc = new Scanner(System.in);
	
	private int saldoActual;

	public Cajero(int saldoActual) {

		this.saldoActual = saldoActual;

	}

	public int getSaldoActual() {
		return saldoActual;
		
	}

	public int retiro() {
		System.out.println("Cuanto le gustaria retirar");
		int retiro = sc.nextInt();
		
		saldoActual-=retiro;
		System.out.println();
		System.out.println("Su retiro es de: "+retiro);
		System.out.println("Su saldo actual es de: "+saldoActual);
		System.out.println();
		
		return retiro;
	}
	
	public int deposito() {
		System.out.println("Cuanto le gustaria retirar");
		int deposito = sc.nextInt();
		
		saldoActual+=deposito;
		System.out.println();
		System.out.println("Su deposito es de: "+deposito);
		System.out.println("Su saldo actual es de: "+saldoActual);
		System.out.println();
		
		
		return deposito;
	}
	
}
