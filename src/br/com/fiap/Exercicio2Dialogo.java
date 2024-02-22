package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio2Dialogo {
	public static void main(String[] args) {
		// Declarando variáveis
		String aux;
				
		double base, altura;
		
		try {
			aux = JOptionPane.showInputDialog("Digite o valor da base desse triângulo");
			base = Double.parseDouble(aux);
			
			aux = JOptionPane.showInputDialog("Digite o valor da altura desse triângulo");
			altura = Double.parseDouble(aux);
			
			double areaTriangulo = (base * altura) / 2;
			
			JOptionPane.showMessageDialog(null, "A área do triângulo é " + areaTriangulo);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto de número! Tente novamente!");
		}
	}
}
