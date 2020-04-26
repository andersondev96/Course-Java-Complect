// ATIVIDADE USANDO CLASSES E MÉTODOS ESTÁTICOS E ENUMERADORES EM JAVA

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enuns.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date DataAtual = new Date();
		
		System.out.println("Enter cliente data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.println("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(DataAtual, status, client);
				
		System.out.println("How many items to this order ? ");
		int OrderItens = sc.nextInt();
		
		for (int i = 1; i <= OrderItens; i++) {
			System.out.println("Enter # " + i + " item data:");
			System.out.println("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Product price: ");
			double productPrice = sc.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			
			
			OrderItem item = new OrderItem(quantity, productPrice, product);
			order.addItem(item);
			
			
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();

	}

}
