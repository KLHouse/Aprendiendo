package Polimorfismoo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mitarbeiter {
	private String name;
	private double gehalt;
	private Date geboren;
	
	public Mitarbeiter(String name, double gehalt, Date geboren) {
		super();
		this.name = name;
		this.gehalt = gehalt;
		this.geboren = geboren;
	}

	public String getDetails() {
		return name + ", geb. am " + new SimpleDateFormat("dd.MM.yyyy").format(geboren) + " verdient " + gehalt + " Euro.";
	}

	public String getName() {
		return name;
	}

	public double getGehalt() {
		return gehalt;
	}

	public Date getGeboren() {
		return geboren;
	}
}
