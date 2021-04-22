
package OnlineShop.Domain;

public class Product {
	//ProdId,Name,TransportGewicht,Netto,MwStSatz,Lagerbestand
	private final int id;
	private final String name;
	private final double weight;
	private double netPrice;
	private int salesTax;
	private int inStock;
	
	public Product(int id, String name, double weight, double netPrice, int salesTax, int inStock) {
		
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.netPrice = netPrice;
		this.salesTax = salesTax;
		this.inStock = inStock;
	}

	public double getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}

	public int getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(int salesTax) {
		this.salesTax = salesTax;
	}

	public int getInStock() {
		return inStock;
	}

	// TODO
//	public void setinStock(int in) {
//		this.inStock = available;
//	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}
	
	public double getGrossPrice() {
		return this.netPrice * (1 + this.getSalesTax() / 100);
	}

	@Override
	public String toString() {
		return String.format("%d - %s zu %.2f Euro", id, name, getGrossPrice());
		
		
		/* */
	}
	
}