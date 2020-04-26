package br.com.exercicio03;

public class Student {
	public String name;
	public double grade1, grade2, grade3, finalgrade = 0;

	public void GradeFinal() {
		finalgrade = grade1 + grade2 + grade3;
		System.out.printf("FINAL GRADE = %.2f\n",finalgrade);
	}
	
	public void Situation(double finalgrade) {
		if (finalgrade >= 60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS",(60-finalgrade));
		}
		
	}
}
