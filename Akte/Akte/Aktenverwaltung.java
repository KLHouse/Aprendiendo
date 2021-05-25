package Akte;

import java.util.ArrayList;

public class Aktenverwaltung {
	Liste liste;

	public Aktenverwaltung() {
		liste = new Liste();
	}

	public void setPatientGlobaleListe(Patient patient) {
		liste.setPatientDieGlobaleListe(patient);

	}

	public ArrayList<Patient> getGlobaleListe() {

		return liste.globaleListeZurückGeben();

	}

	public void eigeneListenErstellen(int ID, Patient patient) {
		liste.eigeneListenErstellen(ID, patient);
	}
	
	public void getWerteEinerListe(int ID) {
		liste.werteEinerListeZurückGeben(ID);
	}
	
	public void setNeueWerte(int ID, String wert) {
		liste.neueWerte(ID,  wert);
	}

}
