// EXERCÍCIOS JAVA - ESTRUTURAS DE REPETIÇÃO


package application;

import java.util.Locale;
import java.util.Scanner;

public class Secao06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// EX 01
		
		/**
		 * Escreva um programa que repita a leitura de uma senha até 
		 * que ela seja válida. Para cada leitura de senha incorreta 
		 * informada, escrever a mensagem "Senha Invalida". Quando a 
		 * senha for informada corretamente deve ser impressa a 
		 * mensagem "Acesso Permitido" e o algoritmo encerrado. 
		 * Considere que a senha correta é o valor 2002.
		 */
		
		
		System.out.println("Digite a sua senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Inválida");
			senha = sc.nextInt();
			
		}
		
		System.out.println("Acesso permitido");
		
		
		// EX 02
		
		/**
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade 
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto 
		 * escrever o quadrante a que ele pertence. O algoritmo será encerrado 
		 * quando pelo menos uma de duas coordenadas for NULA 
		 * (nesta situação sem escrever mensagem alguma).
		 * 
		 */
		
		System.out.println("Escreva as coordenadas de um plano cartesiano: ");
		double x = sc.nextInt();
		double y = sc.nextInt();
		
		while (x != 0.0 && y != 0.0) {
			
			if (x > 0 && y > 0){
				System.out.println("Primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			else if (x > 0 && y < 0) {
				System.out.println("Quarto");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
			
		}
		
		
		// EX 03
		
		/**
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem 
		 * a preferência de seus clientes. Escreva um algoritmo para ler o tipo de 
		 * combustível abastecido (codificado da seguinte forma: 
		 * 
		 * 1.Álcool 2.Gasolina 3.Diesel 4.Fim). 
		 * 
		 * Caso o usuário informe um código inválido (fora da faixa de 1 a 4) 
		 * deve ser solicitado um novo código (até que seja válido). 
		 * O programa será encerrado quando o código informado for o número 4. 
		 * Deve ser escrito a mensagem: "MUITO OBRIGADO" e a 
		 * quantidade de clientes que abasteceram cada tipo de 
		 * combustível, conforme exemplo.
		 */
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1)
			{
				alcool += 1;
			}
			else if (tipo == 2) {
				gasolina += 1;
			}
			else if (tipo == 3) {
				diesel += 1;
			}
			
			tipo = sc.nextInt();
		}
	
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + alcool);
		System.out.println("Álcool: " + gasolina);
		System.out.println("Álcool: " + diesel);
		
		
		
	sc.close();

	}

}
