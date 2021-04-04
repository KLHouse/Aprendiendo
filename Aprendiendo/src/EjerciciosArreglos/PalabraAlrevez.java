package EjerciciosArreglos;

public class PalabraAlrevez {

	public static void main(String[] args) {

		
		String b = alrevez("Amazing");
		System.out.println(b);

	}

	public static String alrevez(String s) {

		char[] palabra = new char[s.length()];

		int index = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			palabra[index] = s.charAt(i);
			index++;
		}

		String alRevez = "";

		for (int i = 0; i < s.length(); i++) {
			alRevez = alRevez + palabra[i]; // Aqui estamos sumando un String, es como tener
											// String s = "a"; String b = "b"; String c = "a"+"b"; Lo cual da ab
			}
		return alRevez;
	}

}
