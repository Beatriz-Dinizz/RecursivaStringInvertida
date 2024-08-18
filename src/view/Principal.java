package view;

import controller.PalavraInvertida;

public class Principal {

	public static void main(String[] args) {
		String palavraOriginal = "dados";
		String palavraInvertida = PalavraInvertida.inverterPalavra(palavraOriginal);
		
		System.out.println("Palavra original: " + palavraOriginal + "\nPalavra invertida: " + palavraInvertida);
	}
}
