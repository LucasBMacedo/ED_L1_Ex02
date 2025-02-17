package controller;

public class MenorValorDoVetor {

	public MenorValorDoVetor() {
          super();
	}
	public int menorvalordovet(int[] vetor, int tamanho, int ultimap) {
    	if (tamanho < 0) {
    		return ultimap; // Condicao de parada quando o tamanhoi for menor que a posicao inicial.
    	}
    	if (vetor [tamanho] < ultimap) { 
    		ultimap = vetor [tamanho]; // Se a ultima posicao do vetor for menor que o menor valor anterior, o menor valor será substituído por esse novom menor. 
    	}
    	tamanho--; // Decrementa o tamanho.
    	return menorvalordovet(vetor, tamanho, ultimap); //Chama a funcao novamente com os novos parametros.
	}
}
