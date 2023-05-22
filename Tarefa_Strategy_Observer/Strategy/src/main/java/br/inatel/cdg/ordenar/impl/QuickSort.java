package br.inatel.cdg.ordenar.impl;

import java.util.List;

import br.inatel.cdg.Metodo;

public class QuickSort implements Metodo {

	@Override
	public List<Integer> ordenacao(List<Integer> lista) {
		quickSort(lista, 0, lista.size() - 1);
		return lista;
	}

	private void quickSort(List<Integer> lista, int inicio, int fim) {
		if (inicio < fim) {
			int indice = part(lista, inicio, fim);
			quickSort(lista, inicio, indice - 1);
			quickSort(lista, indice + 1, fim);
		}
	}

	private int part(List<Integer> lista, int inicio, int fim) {
		int pivo = lista.get(fim);
		int indice = inicio - 1;

		for (int i = inicio; i < fim; i++) {
			if (lista.get(i) <= pivo) {
				indice++;
				trocarElementos(lista, indice, i);
			}
		}

		trocarElementos(lista, indice + 1, fim);

		return indice + 1;
	}

	private void trocarElementos(List<Integer> lista, int i, int j) {
		int temp = lista.get(i);
		lista.set(i, lista.get(j));
		lista.set(j, temp);
	}
}
