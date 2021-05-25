package Akte;

public class Patient {

	private String name;
	private int ID;
	private double glucose;
	private double Kalium;
	private String zeitStempel;

	public Patient(int ID, String name, double glucose, double Kalium, String zeitStempel) {

		this.name = name;
		this.ID = ID;
		this.glucose = glucose;
		this.Kalium = Kalium;
		this.zeitStempel = zeitStempel;

	}

	public String getZeitStempel() {
		return zeitStempel;
	}

	public void setZeitStempel(String zeitStempel) {
		this.zeitStempel = zeitStempel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getGlucose() {
		return glucose;
	}

	public void setGlucose(double glucose) {
		this.glucose = glucose;
	}

	public double getKalium() {
		return Kalium;
	}

	public void setKalium(double Kalium) {
		this.Kalium = Kalium;
	}

	@Override
	public String toString() {
		return "Name: " + name + " ID: " + ID + " glucose: " + glucose + " Kalium=" + Kalium +"  Zeitstempel: "+zeitStempel;
	}

}
