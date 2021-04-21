package Builder;

public class Prüfungsergebnis {

	private final String PNAME;
	private final int ECTS;
	private final double NOTE;
	public Prüfungsergebnis(String pName, int ects, double note) {
		super();
		PNAME = pName;
		ECTS = ects;
		NOTE = note;
	}
	public String getpNmae() {
		return PNAME;
	}
	public int getEcts() {
		return ECTS;
	}
	public double getNote() {
		return NOTE;
	}
	@Override
	public String toString() {
		return "Prüfungsergebnis [PNAME=" + PNAME + ", ECTS=" + ECTS + ", NOTE=" + NOTE + "]";
	}
	
	
	
}
