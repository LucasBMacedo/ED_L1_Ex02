package view;

import javax.swing.JOptionPane;

import controller.MenorValorDoVetor;

public class Principal {

	public static void main(String[] args) {
		MenorValorDoVetor menorvalordovetor = new MenorValorDoVetor(); 
		int indice = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho do vetor?")); 
		int i; 
		int vetor [] = new int [indice]; 
		for (i = 0; i < indice; i ++) {
		vetor [i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da posiçao " + i + " do vetor."));
		}
		int menorAtual = vetor[indice - 1]; 
		int resultado = menorvalordovetor.menorvalordovet(vetor, indice-1, menorAtual); 
		JOptionPane.showMessageDialog(null, "O menor valor contido no vetor é " + resultado);	
	}
}