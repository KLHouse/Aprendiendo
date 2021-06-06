package CajeroAutomatico;

import java.util.Scanner;

public class UI {
	Scanner sc = new Scanner(System.in);
	private int saldoActual;


	public void menu(Cajero b) {

		saldoActual = b.getSaldoActual();

		int opcion;

		do {
			System.out.println("Digite por favor una opcion");
			System.out.println("      1. Consulta de saldo");
			System.out.println("      2. Retiro de efectivo");
			System.out.println("      3. Deposito de efectivo");
			System.out.println("      4. Salir");
			opcion = sc.nextInt();
			if (opcion >= 5) {
				System.out.println("Opcion no valida, digite una opcion correcta");
				System.out.println();
			}

			switch (opcion) {
			case 1:
				System.out.println("Su saldo actual es de: " + saldoActual);
				System.out.println();
				break;
			case 2:
				b.retiro();
				break;
			case 3:

				b.deposito();

				break;
			case 4:
				salir();
				break;

			}

		} while (opcion != 4);

	}

	public void salir() {
		System.out.println("Gracias, hasta luego");
		System.out.println();
	}

}
