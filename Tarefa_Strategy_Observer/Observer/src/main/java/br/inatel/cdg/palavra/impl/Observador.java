package br.inatel.cdg.palavra.impl;

import br.inatel.cdg.palavra.interfaces.iObservador;

public class Observador implements iObservador {

	int id;

	public Observador(int id) {
		this.id = id;
	}

	@Override
	public void update(Observavel observavel) {
		System.out.println("Observador " + id + " recebeu a notificação");
		System.out.println("Quantidade de palavras: " + observavel.contPalavra(observavel.getFrase()));
		System.out.println("Quantidade de palavras pares: " + observavel.contPalavraPar(observavel.getFrase()));
		System.out.println("Quantidade de palavras comecadas com letras maiusculas: " + observavel.contPalavrasMaiuscula(observavel.getFrase()));
	}
	
}