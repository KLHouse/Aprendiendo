package Builder;

public class Student {

	// Instanzvariablen
	private String vorname;
	private String nachname, studiengang;
	private int mtrikelnummer;
	private int startsemester;
	
	// Klassenvariable
		private static int zähler = 0;

	public Student(Builder bob) {
		vorname = bob.vorname;
		nachname = bob.nachname;
		studiengang = bob.studiengang;
		mtrikelnummer = bob.mtrikelnummer;
		startsemester = bob.startsemester;
		zähler++;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {

		if (nachname == null || "".contentEquals(nachname) || nachname.length() <= 1) {
			throw new IllegalArgumentException("Leere Namen sind ungültig.");
		}
		this.nachname = nachname;
	}

	public String getStudiengang() {
		return studiengang;
	}

	public void setStudiengang(String studiengang) {
		this.studiengang = studiengang;
	}

	public int getMtrikelnummer() {
		return mtrikelnummer;
	}

	public void setMtrikelnummer(int mtrikelnummer) {
		this.mtrikelnummer = mtrikelnummer;
	}

	public int getStartsemester() {
		return startsemester;
	}

	public void setStartsemester(int startsemester) {
		this.startsemester = startsemester;
	}

	public static class Builder { // static um builder objekte zu erzuegen ohne eine instanz von del klasse
									// student

		private String vorname;
		private String nachname, studiengang;
		private int mtrikelnummer, startsemester;

		public Builder() {

		}

		public Builder Vorname(String vorname) {
			this.vorname = vorname;
			return this;
		}

		public Builder Nachname(String nachname) {
			this.nachname = nachname;
			return this;
		}

		public Builder Studiengang(String studiengang) {
			this.studiengang = studiengang;
			return this;
		}

		public Builder Mtrikelnummer(int mtrikelnummer) {
			this.mtrikelnummer = mtrikelnummer;
			return this;
		}

		public Builder Startsemester(int startsemester) {
			this.startsemester = startsemester;
			return this;
		}

		public Student build() {
			if (nachname == null)
				throw new IllegalArgumentException("Name muss gesetzt werden!");
			if (vorname == null)
				throw new IllegalArgumentException("Vorname muss gesetzt werden!");

			if (studiengang == null)
				studiengang = "IB";

			if (mtrikelnummer == 0)
				throw new IllegalArgumentException("Matrikelnummer muss gesetzt werden!");

			if (startsemester == 0)
				startsemester = 20211;

			return new Student(this);
		}

	}// end of builder

}// end of student
