// EXERCICIOS DE FIXAÇÃO SOBRE POLIMORFISMO JAVA

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> tax = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" +i+ " data: ");
			System.out.println("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Anual income: ");
			double income = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.println("Health expenditures: ");
				double healthSpending = sc.nextDouble();
				Individual individual = new Individual(name, income, healthSpending);
				tax.add(individual);
				
			} else if (ch == 'c') {
				System.out.println("Number of Employess: ");
				int employessNumber = sc.nextInt();
				Company company = new Company(name, income, employessNumber);
				tax.add(company);
				
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (TaxPayer t: tax ) {
			System.out.println(t.getName() + ": $ " + String.format("%.2f", t.Tax()));
		}
		
		double totalTaxes = 0.0;
		
		for (TaxPayer t: tax) {
			totalTaxes += t.Tax();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
		
		sc.close();

	}

}
