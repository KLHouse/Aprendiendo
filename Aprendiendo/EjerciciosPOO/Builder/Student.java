package Builder;

import java.util.LinkedList;

public class Student {

	// Instanzvariablen
	private String vorname;
	private String name, studiengang;
	private final int MATRIKELNUMMER;
	private final int STARTSEMESTER;

	private LinkedList<Prüfungsergebnis> prüfungen;

	private Student(Builder bob) {
		vorname = bob.vorname;
		name = bob.name;
		studiengang = bob.studiengang;
		MATRIKELNUMMER = bob.matrikelnummer;
		STARTSEMESTER = bob.startsemester;

		prüfungen = new LinkedList<>();
	}

	// Instanzmethoden
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || "".contentEquals(name) || name.length() <= 1) {
			throw new IllegalArgumentException("Leere Namen sind ungültig.");
		}

		this.name = name;
	}

	public String getStudiengang() {
		return studiengang;
	}

	public void setStudiengang(String studiengang) {		
		this.studiengang = studiengang;
	}

	public int getStartsemester() {
		return STARTSEMESTER;
	}

	public int getMatrikelnummer() {
		return MATRIKELNUMMER;
	}

	public void prüfungsergebnisHinzufügen(Prüfungsergebnis pe) {
		prüfungen.add(pe);
	}

	public String getPrüfungsergebnisse() {
		StringBuilder sb = new StringBuilder();

		for (Prüfungsergebnis pe : prüfungen)
			sb.append(pe.toString() + System.lineSeparator());

		return sb.toString();
	}

	private double notenschnittBerechnen() {
		double note = 0;
		double gesamtEcts = 0;

		for (Prüfungsergebnis pe : prüfungen) {
			note += pe.getNote() * pe.getEcts();
			gesamtEcts += pe.getEcts();	
		}
		
		return note / gesamtEcts;
	}

	@Override
	public String toString() {
		return "Student \nVorname=" + vorname + ", \nName=" + name + ", studiengang=" + studiengang + ", "
				+ "MATRIKELNUMMER=" + MATRIKELNUMMER + ", STARTSEMESTER=" + STARTSEMESTER 
				+ ", Notenschnitt = " +notenschnittBerechnen() + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + MATRIKELNUMMER;
		result = prime * result + STARTSEMESTER;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((studiengang == null) ? 0 : studiengang.hashCode());
		result = prime * result + ((vorname == null) ? 0 : vorname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (MATRIKELNUMMER != other.MATRIKELNUMMER)
			return false;
		if (STARTSEMESTER != other.STARTSEMESTER)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (studiengang == null) {
			if (other.studiengang != null)
				return false;
		} else if (!studiengang.equals(other.studiengang))
			return false;
		if (vorname == null) {
			if (other.vorname != null)
				return false;
		} else if (!vorname.equals(other.vorname))
			return false;
		return true;
	}

	public static class Builder {
		private String vorname;
		private String name, studiengang;
		private int matrikelnummer = 0;
		private int startsemester = 0;

		public Builder() {
		}

		public Builder vorname(String vorname) {
			this.vorname = vorname;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder studiengang(String studiengang) {
			this.studiengang = studiengang;
			return this;
		}

		public Builder matrikelnummer(int matrikelnummer) {
			this.matrikelnummer = matrikelnummer;
			return this;
		}

		public Builder startsemester(int startsemester) {
			this.startsemester = startsemester;
			return this;
		}

		public Student build() {
			if (name == null)
				throw new IllegalArgumentException("Name muss gesetzt werden!");
			if (vorname == null)
				throw new IllegalArgumentException("Vorname muss gesetzt werden!");

			if (studiengang == null)
				studiengang = "IB";

			if (matrikelnummer == 0)
				matrikelnummer = Studiverwaltung.generiereMatrikelnummer();

			if (startsemester == 0)
				startsemester = Studiverwaltung.getAktuellesSemester();

			return new Student(this);
		}

	} // end Builder

} // end of Student