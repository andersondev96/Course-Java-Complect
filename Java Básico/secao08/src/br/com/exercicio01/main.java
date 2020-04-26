// CLASSE RETÂNGULO JAVA - BÁSICO

package br.com.exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		rectangle rectangle = new rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n" , rectangle.Area());
		System.out.printf("PERIMETER = %.2f%n" , rectangle.Perimeter());
		System.out.printf("DIAGONAL = %.2f%n" , rectangle.Diagonal());
		sc.close();

	}

}
