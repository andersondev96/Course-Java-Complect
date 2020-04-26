package br.com.exercicio02;

public class Employee {
	public String name;
	public double GrossSalary, Tax;
	
	public double netSalary() {
		return GrossSalary - Tax;
		
	}
	
	public void IncreaseSalary(double percentage) {
		GrossSalary += GrossSalary * percentage/100; 
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}
