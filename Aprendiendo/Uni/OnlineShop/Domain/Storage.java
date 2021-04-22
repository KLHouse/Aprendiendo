package OnlineShop.Domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {

	// Atributte
	private ArrayList<Product> products;

	// Kontruktor
	public Storage() throws FileNotFoundException {
		products = new ArrayList<>();

		Scanner sc = new Scanner(new File("resources/produkte.csv"));
		sc.nextLine();

		while (sc.hasNext()) {
			String line = sc.nextLine();
			String[] es = line.split(",");

			Product p = new Product(Integer.parseInt(es[0]), es[1], Double.parseDouble(es[2]),
					Double.parseDouble(es[3]), Integer.parseInt(es[4]), Integer.parseInt(es[5]));

			products.add(p);
		}

		sc.close();
	}

	// Getter
	public Product[] getProductList() {
		return products.toArray(new Product[0]);// Die null ist die Größe, und die spielt auch keine Rolle

	}
}
