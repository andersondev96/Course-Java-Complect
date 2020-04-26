// CLASSES E MÉTODOS ESTÁTICOS EM JAVA

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProducted;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++ ) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Price: ");
			double price = sc.nextDouble();
			if (ch == 'i') {
				System.out.println("Customs free: ");
				double customsFree = sc.nextDouble();
				ImportedProduct imported = new ImportedProduct(name, price, customsFree);
				list.add(imported);
			}
			else if (ch == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				UsedProducted used = new UsedProducted(name, price, manufactureDate);
				list.add(used);
			}
			else if (ch == 'c'){
				Product product = new Product(name, price);
				list.add(product);
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product prod: list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
		

	}

}
