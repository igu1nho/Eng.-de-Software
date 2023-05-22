package br.inatel.cdg.palavra.interfaces;

import br.inatel.cdg.palavra.impl.Observador;

public interface iObservavel {

	public void registraObservador(Observador observador);

	public void removeObservador(Observador observador);

	public void notificaObservadores();


}