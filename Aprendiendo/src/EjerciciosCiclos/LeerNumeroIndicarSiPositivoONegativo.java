package EjerciciosCiclos;

import java.util.Scanner;

public class LeerNumeroIndicarSiPositivoONegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite un numero");
		int numero = sc.nextInt();
		
		if (numero!= 0) {
			while (numero!= 0) {
				if (numero>0) {
					System.out.println("El numero es postivo");
					System.out.println("Digite un nuevo numero");
					numero =sc.nextInt();
				}else if(numero<0){
					System.out.println("El numero es negativo");
					System.out.println("Digite un nuevo numero");
					numero = sc.nextInt();
				}
			}
			sc.close();
		}else {
			System.out.println("Ha introducido un cero");
		}
	}

}
