package Passwort;

public class Main {

	public static void main(String[] args) {
		
		String password="";
		char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
		password+=minusculas;
		
		System.out.println(password);
		System.out.println((int)Math.floor(Math.random()*(123-97)+97));

		System.out.println(((int)Math.floor(Math.random()*3+1)));
	}

}
