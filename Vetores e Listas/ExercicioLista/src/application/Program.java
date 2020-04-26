// EXERCÍCIOS SOBRE LISTAS - JAVA

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employess will be registred? ");
		int employess = sc.nextInt();
		
		for (int i = 1; i <= employess; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.println("Id: ");
			int id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			Employee e = new Employee(id, name, salary);
			list.add(e);
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int id_employee = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id_employee).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employess: ");
		for (Employee e : list) {
			System.out.println(e);
			
		}
		
		sc.close();

	}

}
