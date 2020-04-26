// CLASSE EMPREGADO - BÁSICO

package br.com.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double percentage;
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.println("Witch percentage to increase salary ? ");
		percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + employee);
		sc.close();
		

	}

}
