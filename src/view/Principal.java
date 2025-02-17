package view;

import javax.swing.JOptionPane;

import controller.MenorValorDoVetor;

public class Principal {

	public static void main(String[] args) {
		MenorValorDoVetor menorvalordovetor = new MenorValorDoVetor(); // Instancia da classe controller.
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho do vetor?")); // Definicao do tamanho do vetor.
		int i; // Contador.
		int vetor [] = new int [tamanho]; //Criacao do vetor.
		for (i = 0; i < tamanho; i ++) {
		vetor [i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da posiçao " + i + " do vetor.")); // Coleta dos valores do vetor.
		}
		int ultimap = vetor[tamanho - 1]; // Menor valor inicial.
		int resultado = menorvalordovetor.menorvalordovet(vetor, tamanho-1, ultimap); // Chamada da funcao recursiva para obter o menor valor.
		JOptionPane.showMessageDialog(null, "A menor posicao do vetor é " + resultado);	// Resultado.	
	}
}