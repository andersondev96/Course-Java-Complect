// CLASSE STUDENT JAVA - BÁSICO

package br.com.exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student st = new Student();
		
		System.out.println("Name: ");
		st.name = sc.nextLine();
		System.out.println("Grades: ");
		st.grade1 = sc.nextDouble();
		st.grade2 = sc.nextDouble();
		st.grade3 = sc.nextDouble();
		st.GradeFinal();
		st.Situation(st.finalgrade);
		
		
		sc.close();
	}

}
