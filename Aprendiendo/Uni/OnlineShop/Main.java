package OnlineShop;

import java.io.FileNotFoundException;

import OnlineShop.Fassade.Shop;
import OnlineShop.UI.UI;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Shop shop;
		try {
			shop = new Shop();
			UI ui = new UI(shop);
		} catch (FileNotFoundException e) {
			System.err.println("Shop konnte nicht initialisiert werden.");
		}
		
		System.out.println("Auf Wiedersehen!");
	}
	
	
}


