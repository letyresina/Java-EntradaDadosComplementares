package br.com.fiap;

import java.util.Scanner;

public class Exercicio4Dialogo {
	public static void main(String[] args) {
		Scanner scan;
		
		double a, b, c;
		
		try {
			scan = new Scanner(System.in); // instanciando o objeto
			
			System.out.println("Qual o valor do coeficiente principal da equação?");
			a = scan.nextDouble();
			
			System.out.println("Qual o valor do coeficiente secundário da equação?");
			b = scan.nextDouble();
			
			System.out.println("Qual o valor do coeficiente independente da equação?");
			c = scan.nextDouble();
			
			double delta = (b * b) - 4 * a * c;
			double x1 = ((- b) + Math.sqrt(delta)) / (2 * a);
		    double x2 = ((- b) - Math.sqrt(delta)) / (2 * a);
		    
		    System.out.println("Delta: " + delta);
		    System.out.println("X1: " + x1);
		    System.out.println("X2: " + x2);
			
		} catch (Exception e) {
			System.out.println("Formato incorreto de número! Tente novamente!");
		}
	}
}
