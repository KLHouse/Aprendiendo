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

		return liste.globaleListeZur�ckGeben();

	}

	public void eigeneListenErstellen(int ID, Patient patient) {
		liste.eigeneListenErstellen(ID, patient);
	}
	
	public void getWerteEinerListe(int ID) {
		liste.werteEinerListeZur�ckGeben(ID);
	}
	
	public void setNeueWerte(int ID, String wert) {
		liste.neueWerte(ID,  wert);
	}

}
