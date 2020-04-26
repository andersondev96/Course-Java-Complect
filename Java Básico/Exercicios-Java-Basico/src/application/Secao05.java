// EXERCÍCIOS JAVA - ESTRUTURAS CONDICIONAIS

package application;

import java.util.Locale;
import java.util.Scanner;

public class Secao05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// EX 01
		
		/**
		 * 	Fazer um programa para ler um número inteiro,
		 *  e depois dizer se este número é negativo ou não.
		 */
		
		int value;
		System.out.println("Digite um número: ");
		value = sc.nextInt();
		
		if (value >= 0) {
			System.out.println("POSITIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		
		// EX 02
		
		/**
		 * 	Fazer um programa para ler um número inteiro e dizer 
		 * 	se este número é par ou ímpar.
		 */
		
		int num;
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		if (num%2 == 0)
			System.out.println("É PAR");
		else
			System.out.println("É ÍMPAR");
		
		
		// EX 03
		
		/**
		 * 	Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma
		 *  mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os 
		 *  valores lidos são múltiplos entre si. Atenção: os números devem 
		 *  poder ser digitados em ordem crescente ou decrescente.
		 */
		
		int a,b;
		System.out.println("Digite dois numeros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("SÃO MÚLTIPLOS");
		}
		else {
			System.out.println("NÃO SOU MÚLTIPLOS");
		}
		
		
		// EX 04
		
		/**
		 * 	Leia a hora inicial e a hora final de um jogo. A seguir calcule a 
		 * 	duração do jogo, sabendo que o mesmo pode começar em um dia e terminar
		 *  em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		
		int hr_inicial, hr_final;
		int duracao = 0;
		System.out.println("Digite a hora inicial e final de um jogo: ");
		hr_inicial = sc.nextInt();
		hr_final = sc.nextInt();
		
		if (hr_final > hr_inicial) {
			duracao = hr_final - hr_inicial;
		}
		else {
			duracao = 24 - hr_inicial + hr_final;
		}
		
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		
		// EX 05
		
		/**
		 * 	Com base na tabela abaixo, escreva um programa que leia o código de um
		 *  item e a quantidade deste item. A seguir, calcule e mostre o valor da conta 
		 *  a pagar.
		 *  
		 *  CODIGO				ESPECIFICACAO				PRECO
		 *  1					Cachorro Quente				R$ 4,00
		 *  2					X-Salada					R$ 4,50
		 *  3					X-Bacon						R$ 5,00
		 *  4					Torrada simples				R$ 2,00
		 *  5					Refrigerante				R$ 1,50
		 */
		
		int codigo, quantidade;
		double preco = 0.0;
		System.out.println("Digite o codigo e a quantidade do item: ");
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		
		
		if (codigo == 1) {
			
			preco = 4.00 * quantidade;
			
		} else if (codigo == 2) {
			
			preco = 4.50 * quantidade;
			
		} else if (codigo == 3) {
			
			preco = 5.00 * quantidade;
			
		} else if (codigo == 4) {
			
			preco = 2.00 * quantidade;
			
		} else {
			
			preco = 1.50 * quantidade;
			
		}
		
		
		System.out.println("TOTAL: R$ " + String.format("%.2f", preco)); 
		
		// EX 06
		
		/**
		 * 	Você deve fazer um programa que leia um valor qualquer e apresente 
		 * 	uma mensagem dizendo em qual dos seguintes intervalos ([0,25], 
		 * 	(25,50], (50,75], (75,100]) este valor se encontra. Obviamente se 
		 * 	o valor não estiver em nenhum destes intervalos, deverá ser impressa 
		 * 	a mensagem “Fora de intervalo”.
		 */
		
		double n;
		System.out.println("Digite um valor: ");
		n = sc.nextDouble();
		if (n > 0 && n <= 25) {
			System.out.println("(0,25]");
		} else if (n > 25 && n <= 50) {
			System.out.println("(25,50]");
		} else if (n > 50 && n <= 75) {
			System.out.println("(50,75]");
		} else if (n > 75 && n <= 100) {
			System.out.println("(75,100]");
		} else {
			System.out.println("FORA DO INTERVALO");
		}
		
		
		// EX 07
		
		/**
		 * Leia 2 valores com uma casa decimal (x e y), que devem representar as 
		 * coordenadas de um ponto em um plano. A seguir, determine qual o 
		 * quadrante ao qual pertence o ponto, ou se está sobre um dos eixos 
		 * cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, 
		 * escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva 
		 * “Eixo X” ou “Eixo Y”, conforme for a situação.
		 */
		
		double x,y;
		System.out.println("Digite os valores de x e y: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if (x == 0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		
		
		// EX 08
		
		/**
		 * Em um país imaginário denominado Lisarb, todos os habitantes ficam 
		 * felizes em pagar seus impostos, pois sabem que nele não existem políticos 
		 * corruptos e os recursos arrecadados são utilizados em benefício da população, sem 
		 * qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. 
		 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa 
		 * de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de 
		 * Imposto de Renda, segundo a tabela abaixo.
		 * 
		 * RENDA								IMPOSTO DE RENDA
		 * de 0.00 a R$ 2000.00					Isento
		 * de R$ 2000.01 até R$ 3000.00			8%
		 * de R$ 3000.01 até R$ 4500.00			18%
		 * acima de R$ 4500.00					28%
		 * 
		 * 	Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre 
		 * 	R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta
		 *  de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre 
		 *  R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve
		 *   ser impresso com duas casas decimais.
		 */
		
		double salario = 0, imposto = 0.0;
		System.out.println("Digite o seu salário em R$: ");
		salario = sc.nextDouble();
		
		if (salario <= 2000.00) {
			imposto = 0.0;
		}
		else if (salario <= 3000.00) {
			imposto = (salario - 2000.00) * 0.08;
		}
		else if (salario <= 4500) {
			imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
		}
		else if (salario > 4500) {
			imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000 * 0.08;
		}
		if (imposto == 0.0) {
			System.out.println("Insento");
		}
		else {
			System.out.printf("R$ %.2f%n",imposto);
		}
		
		
		sc.close();
		
		
		

	}
	

}
