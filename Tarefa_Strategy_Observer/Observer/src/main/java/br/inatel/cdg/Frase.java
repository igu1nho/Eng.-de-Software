package br.inatel.cdg;

import br.inatel.cdg.palavra.impl.Observavel;
import br.inatel.cdg.palavra.impl.Observador;

public class Frase {

	public static void main(String[] args) {

		// Criando o observavel (subject) palavras.
		Observavel palavras = new Observavel();

		//Criando 3 observadores e fazendo a inscrição em Netflix.
		Observador obs1 = new Observador(1);
		Observador obs2 = new Observador(2);
		Observador obs3 = new Observador(3);
		Observador obs4 = new Observador(4);
		Observador obs5 = new Observador(5);
		Observador obs6 = new Observador(6);

		palavras.registraObservador(obs1);
		palavras.registraObservador(obs2);
		palavras.registraObservador(obs3);
		palavras.registraObservador(obs4);
		palavras.registraObservador(obs5);
		palavras.registraObservador(obs6);

		String frase = "O CS2 estara disponivel a partir do dia vinte e um de agosto";

		palavras.contPalavra(frase);
		palavras.contPalavraPar(frase);
		palavras.contPalavrasMaiuscula(frase);

		System.out.println("Observadores serao notificados");
		palavras.notificaObservadores();

		// O observador 6 deseja-se desinscrever, pois agora ele joga Valorant
		palavras.removeObservador(obs6);

		// Dia de lancamento do jogo chegou
		String frase2 = "A nova atualizacao do CS2 ja esta disponivel. Aproveite!";

		palavras.contPalavra(frase2);
		palavras.contPalavraPar(frase2);
		palavras.contPalavrasMaiuscula(frase2);

		System.out.println("Observadores serao notificados");
		palavras.notificaObservadores();
	}

}
