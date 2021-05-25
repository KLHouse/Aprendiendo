package Akte;

import java.text.SimpleDateFormat;
import java.util.*;

public class UI {

	private Scanner sc;
	private Aktenverwaltung av;
	private Patient patient;
	private int ID;
	private List<Patient> globaleListe;

	public UI() {

		sc = new Scanner(System.in);
		av = new Aktenverwaltung();
		globaleListe = new ArrayList<Patient>();

		System.out.println("*************************************************");
		System.out.println("	Willkomen in der Akte 2.0");
		System.out.println("*************************************************");
		System.out.println();
		globaleListe();

	}

	public void UI() {

		int option = 0;
		int temp = 0;

		do {

			do {

				System.out.println("Wählen Sie bitte eine Option aus.");
				System.out.println("     1. Neuen Patienten anlegen.");
				System.out.println("     2. Liste der Laborwerte eines Patients.");
				System.out.println("     3. Einem Patienten einen neuen Wert zuweisen.");
				System.out.println("     4. Exit.");

				System.out.print("     Ihre Option: ");

				option = Integer.parseInt(sc.nextLine());

				if (option >= 1 && option <= 5) {
					temp = 1;
				} else {
					System.out.println("------------------");
					System.out.println("Ungültige Eingabe.");
					System.out.println("------------------");
				}

			} while (temp == 0);

			if (option == 1) {
				ID = idEingeben();
				patient = neuerPatient(ID);
				av.setPatientGlobaleListe(patient);
				av.eigeneListenErstellen(ID, patient);
				System.out.println();
				globaleListe();

			} else if (option == 2) {

				ID = idEingeben();
				av.getWerteEinerListe(ID);
				System.out.println();

			} else if (option == 3) {
				
				ID = idEingeben();
				neueWerteHinzufügen(ID);
				System.out.println();
				
			} else if (option == 4) {
				
				goodBye();
				temp = 2;
			}

		} while (temp != 2);

	}

	public void globaleListe() {
		System.out.println("Folgende Patienten sind bei uns angemeldet:");

		System.out.println("----------------------------------------------------------------");
		globaleListe = av.getGlobaleListe();

		if (globaleListe.isEmpty()) {
			System.out.println("Noch keine Patienten. Melden sich bitte an.");
		}

		for (Patient patient : globaleListe) {

			System.out.println("#ID:" + patient.getID() + " #Name:" + patient.getName());

		}
		System.out.println("----------------------------------------------------------------");

	}

	public Patient neuerPatient(int ID) {

		while (existiertID(ID)) {
			System.out.print("ID: ");
			ID = Integer.parseInt(sc.nextLine());
		}

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Glucose: ");
		double glucose = Double.parseDouble(sc.nextLine());

		System.out.print("Kalium: ");
		double Kalium = Double.parseDouble(sc.nextLine());

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm || dd-M-yyyy ");
		String strDate = formatter.format(date);

		patient = new Patient(ID, name, glucose, Kalium, strDate);

		return patient;

	}

	public void neueWerteHinzufügen(int ID) {

		System.out.println("Welchen Wert möchten Sie zu der Liste hinzufügen");
		System.out.println("Glucose (G/g) oder Kalium(K/k)?");
		System.out.print("Ihre Eingabe: ");
		String wert = sc.nextLine();

		if (wert.equalsIgnoreCase("G")) {

			av.setNeueWerte(ID, wert);

		} else if (wert.equalsIgnoreCase("K")) {

			av.setNeueWerte(ID, wert);

		}

	}

	public int idEingeben() {
		System.out.print("ID: ");
		int ID = Integer.parseInt(sc.nextLine());

		return ID;

	}

	public boolean existiertID(int ID) {

		for (Patient patient : globaleListe) {
			if (patient.getID() == ID) {
				return true;
			}
		}

		return false;
	}

	public void goodBye() {
		System.out.println("-----------------------");
		System.out.println("Danke, Aufwiedersehen.");
		System.out.println("-----------------------");

	}

}
