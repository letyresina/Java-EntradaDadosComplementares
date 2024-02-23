package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio3Dialogo {
	public static void main(String[] args) {
		// Declarando variáveis
		String aux;
		
		double baseMaior, baseMenor, altura;
		
		try {
			
			aux = JOptionPane.showInputDialog("Digite o valor da base maior desse trapézio");
			baseMaior = Double.parseDouble(aux);
			
			aux = JOptionPane.showInputDialog("Digite o valor da base menor desse trapézio");
			baseMenor = Double.parseDouble(aux);
			
			aux = JOptionPane.showInputDialog("Digite o valor da altura desse retângulo");
			altura = Double.parseDouble(aux);
			
			double areaTrapezio = ((baseMaior + baseMenor)  * altura) / 2;
			
			JOptionPane.showMessageDialog(null, "A área do trapézio é " + areaTrapezio);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto de número! Tente novamente!");
		}
	}
}
