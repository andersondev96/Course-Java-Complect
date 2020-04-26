// EXERCÍCIOS JAVA - ESTRUTURAS SEQUENCIAIS

package application;

import java.util.Locale;
import java.util.Scanner;

public class Secao04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		// EX 01
		
		/**
		 * 	Faça um programa para ler dois valores inteiros, 
		 * 	e depois mostrar na tela a soma desses números
		 *  com uma mensagem explicativa.
		 */
		System.out.println();
		
		System.out.println("Digite dois valores inteiros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int soma = n1 + n2;
		System.out.println("SOMA: " + soma);
		
		
		// EX 02
		
		/**
		 * 	Faça um programa para ler o valor do raio de um círculo, 
		 * 	e depois mostrar o valor da área deste círculo com quatro
			casas decimais conforme exemplos.
			Fórmula da área: area = π . raio 2
			Considere o valor de π = 3.14159
		 */
		
		System.out.println();
		double PI = 3.14159;
		System.out.println("Digite o raio do círculo: ");
		double raio = sc.nextDouble();
		
		double area = PI * Math.pow(raio, 2);
		System.out.printf("A: %.4f",area);
		
		
		
		// EX 03
		
		/**
		 * 	Fazer um programa para ler quatro valores inteiros 
		 * 	A, B, C e D. A seguir, calcule e mostre a diferença 
		 * 	do produto de A e B pelo produto de C e D segundo 
		 * 	a fórmula: DIFERENCA = (A * B - C * D).
		 */
		
		System.out.println();
		int a=0,b=0,c=0,d = 0;
		int dif = 0;
		System.out.println("Digite quatro valores inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		dif = (a * b - c * d);
		System.out.println("DIFERENÇA: " + dif);
		
		
		
		// EX 04
		
		/**
		 * 	Fazer um programa que leia o número de um funcionário, 
		 * 	seu número de horas trabalhadas, o valor que recebe por
			hora e calcula o salário desse funcionário. A seguir, 
			mostre o número e o salário do funcionário, com duas casas
			decimais.
		 */
		
		int numero, horas;
		double valor, salario;
		
		System.out.println();
		System.out.println("NUMBER: ");
		numero = sc.nextInt();
		System.out.println("HOURS: ");
		horas = sc.nextInt();
		System.out.println("VALUE: ");
		valor = sc.nextDouble();
		
		salario = horas * valor;
		
		System.out.println("NUMBER: " + numero);
		System.out.println("SALARY: U$ " + String.format("%.2f", salario));
		
		
		// EX 05
		
		/**
		 * 	Fazer um programa para ler o código de uma peça 1, o número 
		 * 	de peças 1, o valor unitário de cada peça 1, o código de uma
		 *  peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
		 *  Calcule e mostre o valor a ser pago.
		 */
		
		System.out.println();
		System.out.println("Digite o código da peça 1: ");
		int cod_peca1 = sc.nextInt();
		System.out.println("Digite o número de peças 1: ");
		int num_peca1 = sc.nextInt();
		System.out.println("Digite o valor unitário de cada peça 1: ");
		double val_unit_peca1 = sc.nextDouble();
		
		System.out.println("Digite o código da peça 2: ");
		int cod_peca2 = sc.nextInt();
		System.out.println("Digite o número de peças 2: ");
		int num_peca2 = sc.nextInt();
		System.out.println("Digite o valor unitário de cada peça 2: ");
		double val_unit_peca2 = sc.nextDouble();
		
		double valor_peca1 = num_peca1 * val_unit_peca1;
		double valor_peca2 = num_peca2 * val_unit_peca2;
		
		double val_total = valor_peca1 + valor_peca2;
		
		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", val_total));
		
		// EX 06
		
		/**
		 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão:
		 *  A, B e C. Em seguida, calcule e mostre:
				a) a área do triângulo retângulo que tem A por base e C por altura.
				b) a área do círculo de raio C. (pi = 3.14159)
				c) a área do trapézio que tem A e B por bases e C por altura.
				d) a área do quadrado que tem lado B.
				e) a área do retângulo que tem lados A e B.
		 */
		
		System.out.println();
		System.out.println("Digite três valores: ");
		double A,B,C;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double triangulo = 	A * C/2;
		double circulo =  	3.14159 * C * C;
		double trapezio =  	(A + B)/2.0 * C;
		double quadrado =  	B * B;
		double retangulo = 	A * B;
		
		System.out.println();
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
		

	}

}
