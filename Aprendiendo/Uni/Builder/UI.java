package Builder;

import java.util.Scanner;

public class UI {
	private Studiverwaltung sv;
	private Scanner sc = new Scanner(System.in);

	public UI(Studiverwaltung sv) {
		this.sv = sv;
		/*Die UI ist eng and der Studiverwaltung gekoppelt*/
	}

	public void hauptmenü() {
		System.out.println("Herzlich willkommen zu SV 1.0");

		schleife: do {
			System.out.println("1- Studentendaten eingeben");
			System.out.println("2- Studentendaten abfragen");
			System.out.println("3- Prüfungsergebnis eintragen");
			System.out.println("4- App beenden");

			switch (Integer.parseInt(sc.nextLine())) {
			case 1:
				StudentendatenEingeben();
				break;
			case 2:
				StudentenDatenAbfragen();
				break;
			case 3:
				PrüfungsergbnisEintragen();
				break;

			case 4:
				break schleife;

			}

		} while (true);
		System.out.println("Auf Wiedersehen");
		
		sc.close();
		/*Wir schliessen unser Scanner, weil wenn der Hauptmenü geschlossen ist
		 * würde unser Programm zu ende kommen*/
		
		
		
	}// hauptmenü ende

	private void PrüfungsergbnisEintragen() {
		System.out.println("Prüfungsergebnis eintragen");

		System.out.print("Matrikelnummer: ");
		int matrikelnummer = Integer.parseInt(sc.nextLine());
		
		System.out.print("Prüfungsname: ");
		String pName= sc.nextLine();
		
		System.out.print("ECTS-Punkte: ");
		int ects = Integer.parseInt(sc.nextLine());
		
		System.out.print("Note: ");
		double note = Double.parseDouble(sc.nextLine());
		
		System.out.println(sv.prüfungsErgebnisEintragen(matrikelnummer, pName, ects, note));
	}

	private void StudentenDatenAbfragen() {

		System.out.println("Studentendaten abfragen: ");
		
		System.out.print("Matrikelnummer: ");
		int matrikelnummer = Integer.parseInt(sc.nextLine());
		
		Student s = sv.studentenDatenAbfragen(matrikelnummer);
		
		if (s!=null) {
			System.out.println(s.toString());
		}else {
			System.out.println("Matrikelnummer nicht im System");
		}
	}

	private void StudentendatenEingeben() {
		System.out.println("Studentendaten eingeben");
		System.out.print("Vorname: ");
		String vorname = sc.nextLine();

		System.out.print("Nachname: ");
		String nachname = sc.nextLine();

		System.out.print("Studiengang: ");
		String studiengang = sc.nextLine();

		Student s = new Student.Builder().vorname(vorname).name(nachname).studiengang(studiengang).build();
		sv.studentAbspeichern(s);

		System.out.println("Student abgespeichert" + s.toString());
	}

}
