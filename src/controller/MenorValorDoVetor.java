package controller;

public class MenorValorDoVetor {

	public MenorValorDoVetor() {
          super();
	}
	public int menorvalordovet(int[] vetor, int indice, int menorAtual) {
    	if (indice < 0) {
    		return menorAtual; 
    	}
    	if (vetor [indice] < menorAtual) { 
    		menorAtual = vetor [indice];  
    	}
    	indice--; 
    	return menorvalordovet(vetor, indice, menorAtual); 
	}
}