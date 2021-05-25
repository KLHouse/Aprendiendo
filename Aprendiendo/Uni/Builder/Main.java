package Builder;

public class Main {

	public static void main(String[] args) {
		
		Studiverwaltung sv = new Studiverwaltung();
		
		UI ui = new UI(sv);
		ui.hauptmenü();
	
	}

}
