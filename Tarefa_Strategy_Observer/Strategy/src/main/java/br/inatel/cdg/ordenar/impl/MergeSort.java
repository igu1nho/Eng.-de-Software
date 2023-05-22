package br.inatel.cdg.ordenar.impl;

import java.util.ArrayList;
import java.util.List;

import br.inatel.cdg.Metodo;

public class MergeSort implements Metodo {

	@Override
	public List<Integer> ordenacao(List<Integer> lista) {
		return mergeSort(lista);
	}

	private List<Integer> mergeSort(List<Integer> lista) {
		if (lista.size() <= 1) {
			return lista;
		}

		int meio = lista.size() / 2;
		List<Integer> esquerda = mergeSort(lista.subList(0, meio));
		List<Integer> direita = mergeSort(lista.subList(meio, lista.size()));

		return merge(esquerda, direita);
	}

	private List<Integer> merge(List<Integer> esquerda, List<Integer> direita) {
		List<Integer> merged = new ArrayList<>();

		int e = 0; // índice para percorrer a lista esquerda
		int d = 0; // índice para percorrer a lista direita

		while (e < esquerda.size() && d < direita.size()) {
			if (esquerda.get(e) <= direita.get(d)) {
				merged.add(esquerda.get(e));
				e++;
			} else {
				merged.add(direita.get(d));
				d++;
			}
		}

		// Adicionar os elementos restantes da lista da esquerda
		while (e < esquerda.size()) {
			merged.add(esquerda.get(e));
			e++;
		}

		// Adicionar os elementos restantes da lista da direita
		while (d < direita.size()) {
			merged.add(direita.get(d));
			d++;
		}

		return merged;
	}
}
