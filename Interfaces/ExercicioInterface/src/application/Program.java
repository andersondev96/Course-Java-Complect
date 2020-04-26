// EXERCICIOS SOBRE INTERFACES - JAVA
package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PayPalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data: ");
		System.out.println("Number: ");
		int number = sc.nextInt();
		System.out.println("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.println("Contract value: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.println("Enter number of installments: ");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PayPalService());
		
		contractService.proccessContract(contract, n);
		
		System.out.println("Installments:");
		for (Installment x : contract.getInstallments()) {
			System.out.println(x);
		}
		
		sc.close();
	}
}
