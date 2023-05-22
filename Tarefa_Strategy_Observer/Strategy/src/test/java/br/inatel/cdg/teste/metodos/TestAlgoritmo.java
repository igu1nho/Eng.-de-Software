package br.inatel.cdg.teste.metodos;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

import br.inatel.cdg.ordenar.impl.BubbleSort;
import br.inatel.cdg.ordenar.impl.MergeSort;
import br.inatel.cdg.ordenar.impl.QuickSort;
import br.inatel.cdg.ImplementBubbleSort;
import br.inatel.cdg.ImplementQuickSort;
import br.inatel.cdg.ImplementMergeSort;
import br.inatel.cdg.Algoritmo;

public class TestAlgoritmo {
	
	Algoritmo algoritmo;

	List<Integer> lista;
	List<Integer> ordenado;

	@Before
	public void init() {
		lista = Arrays.asList(8, 2, 10, 6, 4);
		ordenado = Arrays.asList(2, 4, 6, 8, 10);
	}

	@Test
	public void testBubbleSort() {
		algoritmo = new ImplementBubbleSort();
		assertTrue(algoritmo.getMetodo() instanceof BubbleSort);
	}

	@Test
	public void testImplementBubbleSort() {
		algoritmo = new ImplementBubbleSort();

		List<Integer> resultado = algoritmo.ordenacao(lista);
		assertEquals(ordenado, resultado);
	}

	@Test
	public void testMergeSort() {
		algoritmo = new ImplementMergeSort();
		assertTrue(algoritmo.getMetodo() instanceof MergeSort);
	}

	@Test
	public void testImplementMergeSort() {
		algoritmo = new ImplementMergeSort();

		List<Integer> resultado = algoritmo.ordenacao(lista);
		assertEquals(ordenado, resultado);
	}

	@Test
	public void testQuickSort() {
		algoritmo = new ImplementQuickSort();
		assertTrue(algoritmo.getMetodo() instanceof QuickSort);
	}

	@Test
	public void testImplementQuickSort() {
		algoritmo = new ImplementQuickSort();

		List<Integer> resultado = algoritmo.ordenacao(lista);
		assertEquals(ordenado, resultado);
	}
}
