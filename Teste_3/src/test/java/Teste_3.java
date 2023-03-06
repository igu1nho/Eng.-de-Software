import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

//Execício 3 - Sequência de Fibonatti
//Igor L. e Lucas V.
public class Teste_3<I extends Number> {

    @Test
    public void testeFib() {
        Teste_3<Integer> seqFib = new Teste_3 <Integer>();
        int n = 1;
        int fib_n = n;
        assertEquals(fib_n, n);
    }
}