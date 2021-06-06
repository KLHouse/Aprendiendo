package OnlineShop.UI;

import java.util.Scanner;

import OnlineShop.Domain.Product;
import OnlineShop.Fassade.Shop;

public class UI {

	private Shop shop;
	private Scanner sc;

	public UI(Shop shop) {
		this.shop = shop;
		this.sc = new Scanner(System.in);

		System.out.println(shop.getInfo());
		System.out.println("Herzlich Willkommen");
		System.out.println();

		startMenu();
	}

	private void startMenu() {
		
		do {
			System.out.println("Bitte einen Menüpunkt über die zu Beginn stehende Ziffer auswählen:");
			System.out.println("1 - Produkliste anzeigen und einkaufen");
			System.out.println("2 - Warenkorb anzeigen");
			
			System.out.println("9 - Shop verlassen");
			System.out.print("Ihre Auswahl bitte: ");

			int input = Integer.parseInt(sc.nextLine());
			System.out.println();
			// Alternative Switch Case
			if (input == 1) {
				Product[] products = shop.getProductList();
				this.produkteAnzeigen(products);
				this.placeOrder(products);
				
			} else if (input == 2)
				this.showCart();
			else if (input == 9)
				break;
			System.out.println("2-");

		} while (true);

		this.goodbye();
	}

	private void produkteAnzeigen(Product[] products) {
		System.out.println("Heute im Angebot");

		for (Product p : products) {
			System.out.println(p);

		}
		System.out.println();
	}

	private void placeOrder(Product[] products) {
		System.out.println("Bitte das gewünschte Produkt über seinen Productcode auswählen");
		int id = Integer.parseInt(sc.nextLine());

		System.out.println("Wie viele " + products[id - 1].getName() + "möchten Sie kaufen");
		int amount = Integer.parseInt(sc.nextLine());

		shop.addProductToCart(products[id - 1], amount);
		
		System.out.println(products[id-1]+" zum Warenkorb hinzugefügt");

	}

	private void goodbye() {
		System.out.println("Vielen Dank für Ihren Einkauf!");
	}

	private void showCart() {
		System.out.println("Ihr Warenkorb enthält: ");
		System.out.println(shop.getCartContent());
	}

}
