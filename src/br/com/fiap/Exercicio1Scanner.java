package br.com.fiap;

import java.util.Scanner;

public class Exercicio1Scanner {
	public static void main(String[] args) {
		// Declarando variáveis
		Scanner scan;
		
		double base, altura;
		
		// Programa principal
		try {
			scan = new Scanner(System.in); // instanciando o objeto
			
			System.out.println("Qual o valor da base do retângulo?");
			base = scan.nextDouble();
			
			System.out.println("Qual o valor da altura do retângulo?");
			altura = scan.nextDouble();
			
			double areaRetangulo = base * altura;
			
			System.out.println("A área desse retângulo é de " + areaRetangulo);
			
		} catch (Exception e) {
			System.out.println("Formato incorreto de número! Tente novamente!");
		}
	}
}
