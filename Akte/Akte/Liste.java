package Akte;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Liste {

	private ArrayList<Patient> globaleListe;
	Scanner sc1;

	public Liste() {
		globaleListe = new ArrayList<Patient>();
		sc1 = new Scanner(System.in);
	}

	public void setPatientDieGlobaleListe(Patient patient) {

		boolean isAppend;
		if (globaleListe.isEmpty()) {
			isAppend = false;
		} else {
			isAppend = true;
		}

		String eintrag = patient.getID() + "," + patient.getName() + "," + patient.getGlucose() + ","
				+ patient.getKalium() + "," + patient.getZeitStempel();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("Csv/globaleListe.csv", isAppend))) {

			bw.write(eintrag);
			bw.newLine();

			bw.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public ArrayList<Patient> globaleListeZur�ckGeben() {

		Patient patient = null;

		globaleListe = new ArrayList<>();

		try {
			sc1 = new Scanner(new File("Csv/globaleListe.csv"));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		while (sc1.hasNextLine()) {

			String s = sc1.nextLine();
			if (!s.isBlank()) {

				String[] spalten = s.split(",");

				patient = new Patient(Integer.parseInt(spalten[0]), spalten[1], Double.parseDouble(spalten[2]),
						Double.parseDouble(spalten[3]), spalten[4]);
				globaleListe.add(patient);

			}
		}
		return globaleListe;

	}

	public void eigeneListenErstellen(int ID, Patient patient) {

		String eintrag = patient.getID() + "," + patient.getName() + "," + patient.getGlucose() + ","
				+ patient.getKalium() + "," + patient.getZeitStempel();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("Csv/" + ID + ".csv", true))) {

			bw.write(eintrag);
			bw.newLine();

			bw.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void werteEinerListeZur�ckGeben(int ID) {
		Patient patient = null;
		ArrayList<Double> listF�rMedianGlucose = new ArrayList<>();
		ArrayList<Double> listF�rMedianKalium = new ArrayList<>();

		try {
			sc1 = new Scanner(new File("Csv/" + ID + ".csv"));
			System.out.println("Folgende Eintr�ge sind bei uns gemedelt:");
			System.out.println("----------------------------------------------------------------------");
			while (sc1.hasNextLine()) {

				String s = sc1.nextLine();
				if (!s.isBlank()) {

					String[] spalten = s.split(",");

					patient = new Patient(Integer.parseInt(spalten[0]), spalten[1], Double.parseDouble(spalten[2]),
							Double.parseDouble(spalten[3]), spalten[4]);

					System.out.println("#Glucose: " + patient.getGlucose() + ", #Kalium: " + patient.getKalium()
							+ ", #Zeitstempel: " + patient.getZeitStempel());

					listF�rMedianGlucose.add(patient.getGlucose());
					Collections.sort(listF�rMedianGlucose);

					listF�rMedianKalium.add(patient.getKalium());
					Collections.sort(listF�rMedianKalium);
				}
			}

		} catch (FileNotFoundException e) {

			System.err.println("Datei konnte nicht gefunden werde.");
		}
		int anzahlDerWerteGlucose = listF�rMedianGlucose.size();
		double medianGlucose;

		// anzahl gerade
		if (anzahlDerWerteGlucose % 2 == 0) {
			medianGlucose = (listF�rMedianGlucose.get(listF�rMedianGlucose.size() / 2)
					+ listF�rMedianGlucose.get(listF�rMedianGlucose.size() / 2 - 1)) / 2;
			System.out.println("Median Glucose: " + medianGlucose);
		} else {
			medianGlucose = listF�rMedianGlucose.get(listF�rMedianGlucose.size() / 2);
			System.out.println("Median Glucose: " + medianGlucose);
		}

		int anzahlDerWerteKalium = listF�rMedianKalium.size();
		double medianKalium = 0;

		// anzahl gerade
		if (anzahlDerWerteKalium % 2 == 0) {
			medianKalium = (listF�rMedianKalium.get(listF�rMedianKalium.size() / 2)
					+ listF�rMedianKalium.get(listF�rMedianKalium.size() / 2 - 1)) / 2;
			System.out.println("Median Kalium: " + medianKalium);
		} else {
			medianKalium = listF�rMedianKalium.get(listF�rMedianKalium.size() / 2);

			System.out.println("Median Kalium: " + medianKalium);
		}
		System.out.println("----------------------------------------------------------------------");

	}

	public void neueWerte(int ID, String wert) {

		Patient patient = null;

		try {
			sc1 = new Scanner(new File("Csv/" + ID + ".csv"));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		while (sc1.hasNextLine()) {

			String s = sc1.nextLine();
			if (!s.isBlank()) {

				String[] spalten = s.split(",");

				patient = new Patient(Integer.parseInt(spalten[0]), spalten[1], Double.parseDouble(spalten[2]),
						Double.parseDouble(spalten[3]), spalten[4]);

			}
		}

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm || dd-M-yyyy ");
		String strDate = formatter.format(date);

		double neueGlucose = patient.getGlucose();
		double neuerKalium = patient.getKalium();
		Scanner sc = new Scanner(System.in);

		if (wert.equalsIgnoreCase("G")) {

			System.out.print("Neuer Wert: ");
			neueGlucose = Double.parseDouble(sc.nextLine());

		} else if (wert.equalsIgnoreCase("K")) {
			System.out.print("Neuer Wert: ");
			neuerKalium = Double.parseDouble(sc.nextLine());
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Csv/" + ID + ".csv", true));

			String eintrag = patient.getID() + "," + patient.getName() + "," + neueGlucose + "," + neuerKalium + ","
					+ strDate;
			bw.write(eintrag);
			bw.newLine();

			bw.flush();
			bw.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
