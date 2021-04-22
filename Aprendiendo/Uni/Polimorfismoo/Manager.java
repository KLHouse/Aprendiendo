package Polimorfismoo;

import java.sql.Date;

public class Manager extends Mitarbeiter {
	private String abteilung;
	
	public Manager(String name, double gehalt, java.util.Date date, String abteilung) {
		super(name, gehalt, date);
		
		this.abteilung = abteilung;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + " Er leitet die Abteilung " + abteilung + ".";
	}

	public String getAbteilung() {
		return abteilung;
	}

}