package br.com.fiap;

import java.util.Scanner;

public class Exercicio3Scanner {
	public static void main(String[] args) {
		// declarando variáveis
		Scanner scan;
		
		double baseMaior, baseMenor, altura;
		
		// Programa principal
		try {
			
			scan = new Scanner(System.in); // instanciando o objeto
			
			System.out.println("Qual o valor da base maior do trapézio?");
			baseMaior = scan.nextDouble();
			
			System.out.println("Qual o valor da base menor do trapézio?");
			baseMenor = scan.nextDouble();
			
			System.out.println("Qual o valor da altura do trapézio?");
			altura = scan.nextDouble();
			
			double areaTrapezio = ((baseMaior + baseMenor)  * altura) / 2;
			
			System.out.println("A área desse trapézio é de " + areaTrapezio);
					
			
		} catch (Exception e) {
			System.out.println("Formato incorreto de número! Tente novamente!");
		}
	}
}
