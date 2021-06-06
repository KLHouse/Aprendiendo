package CajeroAutomatico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int saldoActual = 500;
		
		Cajero b = new Cajero(saldoActual);
		
		UI a = new UI();
		a.menu(b);
		sc.close();
	}

}
