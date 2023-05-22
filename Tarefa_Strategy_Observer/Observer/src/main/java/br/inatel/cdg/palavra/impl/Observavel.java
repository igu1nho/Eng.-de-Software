package br.inatel.cdg.palavra.impl;

import java.util.ArrayList;
import java.util.List;

import br.inatel.cdg.palavra.interfaces.iObservavel;

public class Observavel implements iObservavel {

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public List<Observador> getObservadores() {
		return observadores;
	}

	public void setObservadores(List<Observador> observadores) {
		this.observadores = observadores;
	}

	private String frase;
	private List<Observador> observadores;

	public Observavel() {
		observadores = new ArrayList<Observador>();
	}

	@Override
	public void registraObservador(Observador observador) {
		observadores.add(observador);
	}

	@Override
	public void removeObservador(Observador observador) {
		if(observadores.contains(observador)) {
			observadores.remove(observador);
		}
	}

	@Override
	public void notificaObservadores() {
		for(Observador observador : observadores) {
			observador.update(this);
		}
	}

	public int contPalavra(String frase) {
		this.frase = frase;
		int numPalavras = frase.split(" ").length;
		return numPalavras;
	}

	public int contPalavraPar(String frase) {
		this.frase = frase;
		int numP = 0;
		for(String palavra : frase.split(" ")) {
			if(palavra.length() % 2 == 0) {
				numP++;
			}
		}
		return numP;
	}

	public int contPalavrasMaiuscula(String frase) {
		this.frase = frase;
		String regex = "^([A-Z])$";
		int numP = 0;
		for(String palavra : frase.split(" ")) {
			if(palavra.charAt(0) >= 'A' && palavra.charAt(0) <= 'Z') {
				numP++;
			}
		}
		return numP;
	}

}