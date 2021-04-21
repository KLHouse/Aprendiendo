package OnlineShop.Domain;

import java.util.LinkedList;

public class Cart {
	private LinkedList<Item> items = new LinkedList<>();

	public void addProduct(Product p, int amount) {
		Item i = new Item(p, amount);
		items.add(i);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		double price = 0;

		if (items.size() == 0) 
			sb.append("nichts" + System.lineSeparator());
		else
			for (Item i : items) {
				sb.append(i.toString() + System.lineSeparator());
				price += i.getTotalPrice();
			}

		sb.append(String.format("Gesamtpreis: %.2f Euro", price));

		return sb.toString();
	}
	public double getPrice() {
		double price = 0;
		
		for(Item i : items) {
			price += i.getTotalPrice();
		}
		return price;
	}

}