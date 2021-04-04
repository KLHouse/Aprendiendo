package EjerciciosCiclos;

public class Pattern {

	public static void main(String[] args) {

//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print("*"); //todos en una linea, cuando j=5, sale del ciclo
//			}
//			System.out.println();
//		}

		for (int i = 1; i < 5; i++) {// el primer caso: i=1, es i menor a 5, si!
			for (int j = 0; j < i; j++) {// entra aqui, es j=0 menor a i=1, si! Imprime una vez *
				System.out.print("*"); // Ahora sube j a 1, es 1 menor a 1, no! Da un salto de linea
			} // ahora i=2 es menor a 5, si! va abajo. es j=0 menor a 2, Si! Imprime 2 veces
				// hasta que j no se menor
			System.out.println();
		}
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {// 0<5 1<5 2<5 3<5 4<5, lo imprime 5 veces, despues 4 porque i baja
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
//El i se encarga de las columnas, y el J de las filas