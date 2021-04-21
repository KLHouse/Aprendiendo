package Polimorfismoo;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Personalverwaltung {

	public static void main(String[] args) {
		Mitarbeiter m1 = new Mitarbeiter("Müller  ", 42000, new GregorianCalendar(1989, 0, 31).getTime());
		Manager m2 = new Manager("Stromberg", 75000, new GregorianCalendar(1977, 6, 10).getTime(), "Finanzen");

		ArrayList<Mitarbeiter> angestellte = new ArrayList<>();
		angestellte.add(m1);
		angestellte.add(m2);
		
		System.out.println("Name     \tGeburtsdatum               \tGehalt  \tAbteilungsleitung");
		for (Mitarbeiter m : angestellte) {
			// gehaltAuszahlen(m);
			
			System.out.println(m.getName() + "\t" + m.getGeboren() + "\t" 
						+ ((!(m instanceof Manager))?m.getGehalt():"XXXXXXX") + "  \t"
						+ ((m instanceof Manager)? ((Manager)m).getAbteilung() : "-"));
		}
		
      	// 	mehr oder weniger sinnvolle Beispiele zur Wdh. des ternären Operators
		// 	System.out.println( (m1.getGehalt() > 100000)?"true":"false"   );	
		//	Mitarbeiter m3 = new Mitarbeiter("Müller  ", (2021-1989 > 40)?47000:42000, new GregorianCalendar(1989, 0, 31).getTime());
	}
	
	public static void gehaltAuszahlen(Mitarbeiter m) {
		// Bsp.-Methode
	}

}