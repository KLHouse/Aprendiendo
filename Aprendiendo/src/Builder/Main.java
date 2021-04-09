package Builder;

public class Main {

	public static void main(String[] args) {
		Student.Builder b = new Student.Builder();
		Student s = b.Nachname("Kleinhenz").Vorname("Stefan").Studiengang("CBS").Startsemester(2020).Mtrikelnummer(2022647).build();

		System.out.println(s.getVorname());
	}

}
