package br.inatel.cdg;

import java.util.List;

// Criando uma classe abstrata responsável por parametrizar um metodo de
// ordenação de uma lista além de buscar e atualizar esta
public abstract class Algoritmo {
	protected Metodo met;

	public List<Integer> ordenacao(List<Integer> lista) {
		return met.ordenacao(lista);
	}

	public void setMetodo(Metodo met) {
		this.met = met;
	}

	public Metodo getMetodo() {
		return met;
	}
}