package OnlineShop.Domain;

public class Item {
	private final Product p;
	private int amount;

	public Item(Product p, int amount) {
		this.p = p;
		this.amount = amount;
	}

	public Product getProduct() {
		return p;
	}

	public int getAmount() {
		return amount;
	}
	
	public double getTotalPrice() {
		return amount * p.getGrossPrice();
	}
	
	public String toString() {
		return String.format("%d * %s für %.2f Euro", amount, p.getName(), getTotalPrice());
	}
	
}