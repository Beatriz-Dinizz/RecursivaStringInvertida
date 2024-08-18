package controller;

public class PalavraInvertida {

	public PalavraInvertida() {
		super();
	}
	
	public static String inverterPalavra(String palavra) {
		// Condição de parada: quando a palavra tiver comprimento 0 ou 1, significa que não tem mais o que inverter.
		if(palavra.length() <= 1) {
			return palavra;
		} else {
			// Relação de chamada dos passos: pega o último caractere da palavra e concatena
	        // com a chamada recursiva para o restante da palavra (excluindo o último caractere)
			
			return palavra.substring(palavra.length() - 1) + inverterPalavra(palavra.substring(0, palavra.length() - 1));
		}
	}
}
