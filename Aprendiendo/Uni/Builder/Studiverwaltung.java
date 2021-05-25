package Builder;

import java.util.HashMap;
import java.util.Random;

public class Studiverwaltung {
	private static int aktuellesSemester = 20211;
	 
	
	private HashMap<Integer, Student> studis = new HashMap<>();
	
	
	public void studentAbspeichern(Student s) {
		studis.put(s.getMatrikelnummer(), s);
	}
	
	
	public Student studentenDatenAbfragen(int matrikelnummer) {
		return studis.get(matrikelnummer);
	}
	
	
	public static int generiereMatrikelnummer() {
		Random random = new Random(System.nanoTime());
		return aktuellesSemester + random.nextInt(999);
	}
	
	
	public static int getAktuellesSemester() {
		return aktuellesSemester;
	}
	
	
	public String pr�fungsErgebnisEintragen(int matrikelnummer, String pName, int ects, double note) {
		Pr�fungsergebnis pe = new Pr�fungsergebnis(pName, ects, note);
		
		Student s = this.studentenDatenAbfragen(matrikelnummer);
		s.pr�fungsergebnisHinzuf�gen(pe);
		
		return s.getPr�fungsergebnisse();
		
	}

}
