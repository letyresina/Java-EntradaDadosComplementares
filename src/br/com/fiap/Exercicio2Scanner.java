package br.com.fiap;

import java.util.Scanner;

public class Exercicio2Scanner {
	public static void main(String[] args) {
		Scanner scan;
		
		double base, altura;
		
		try {
			scan = new Scanner(System.in); // instanciando o objeto
						
			System.out.println("Qual o valor da base do triângulo?");
			base = scan.nextDouble();
			
			System.out.println("Qual o valor da altura do triângulo?");
			altura = scan.nextDouble();
			
			double areaTriangulo = (base * altura) / 2;
			
			System.out.println("A área desse triângulo é de " + areaTriangulo);
			
		} catch (Exception e) {
			System.out.println("Formato incorreto de número! Tente novamente!");
		}
	}
}
