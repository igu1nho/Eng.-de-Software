package br.inatel.cdg.ordenar.impl;

import java.util.List;

import br.inatel.cdg.Metodo;

public class BubbleSort implements Metodo {

	@Override
	public List<Integer> ordenacao(List<Integer> lista) {
		boolean verific = true;
		int aux;

		while (verific) {
			verific = false;
			for (int i = 0; i < lista.size() - 1; i++) {
				if (lista.get(i) > lista.get(i + 1)) {
					aux = lista.get(i);
					lista.set(i, lista.get(i + 1));
					lista.set(i + 1, aux);
					verific = true;
				}
			}
		}
		return lista;
	}

}
