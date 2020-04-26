// EXERCICIO SOBRE SET EM JAVA
package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		Integer courseA = sc.nextInt();
		
		for (int i = 0; i < courseA; i++) {
			Integer number = sc.nextInt();
			a.add(number);
		}
		
		System.out.print("How many students for course B? ");
		Integer courseB = sc.nextInt();
		
		for (int i = 0; i < courseB; i++) {
			Integer number = sc.nextInt();
			b.add(number);
		}
		
		System.out.print("How many students for course C? ");
		Integer courseC = sc.nextInt();
		
		for (int i = 0; i < courseC; i++) {
			Integer number = sc.nextInt();
			c.add(number);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total students: " + total.size());
		
		sc.close();

	}

}
