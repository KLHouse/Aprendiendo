package OnlineShop.Fassade;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import OnlineShop.Domain.Cart;
import OnlineShop.Domain.Product;
import OnlineShop.Domain.Storage;

public class Shop {

	private Storage storage;
	private Cart cart;

	public Shop() throws FileNotFoundException {
		this.storage = new Storage();
		this.cart = new Cart();

	}

	public String getInfo() {
		return "UltraShop 1.0 by HSMA";
	}
	
	public Product[] getProductList(){//ein array damit es von aussen nicht mehr veränderbar ist
		return storage.getProductList();
	}

	public void addProductToCart(Product p, int amount) {
		/*Damit der Shop was anbieten kann, muss er intern die Produkte laden*/
		cart.addProduct(p, amount);
	}
	
	
	public String getCartContent() {
		return cart.toString();
	}
}
