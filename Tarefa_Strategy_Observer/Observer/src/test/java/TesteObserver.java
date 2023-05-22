import br.inatel.cdg.palavra.impl.Observador;
import br.inatel.cdg.palavra.impl.Observavel;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteObserver {

    @Test
    public void testeInscritos(){
        Observavel frase = new Observavel();
        Observador obs1 = new Observador(1);
        frase.registraObservador(obs1);
        assertTrue(!frase.getObservadores().isEmpty());
    }

    @Test
    public void teste5Inscritos(){
        Observavel frase = new Observavel();
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);
        Observador obs4 = new Observador(4);
        Observador obs5 = new Observador(5);
        frase.registraObservador(obs1);
        frase.registraObservador(obs2);
        frase.registraObservador(obs3);
        frase.registraObservador(obs4);
        frase.registraObservador(obs5);
        assertEquals(frase.getObservadores().size(), 5);
    }
}
