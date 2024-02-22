package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio1Dialogo {

	public static void main(String[] args) {
		// Declarando variáveis
		String aux;
		
		double base, altura;
		
		try {
			
			aux = JOptionPane.showInputDialog("Digite o valor da base desse retângulo");
			base = Double.parseDouble(aux);
			
			aux = JOptionPane.showInputDialog("Digite o valor da altura desse retângulo");
			altura = Double.parseDouble(aux);
			
			double areaRetangulo = base * altura;
			
			JOptionPane.showMessageDialog(null, "A área do retângulo é " + areaRetangulo);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto de número! Tente novamente!");
		}

	}

}
