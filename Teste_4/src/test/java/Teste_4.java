import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.Test;

import static org.junit.Assert.*;

//Execício 4 - Levantamento de Excepction
//Igor L. e Lucas V.


public class Teste_4 {
    @Test
    public void testEmptyStackException() {
            Stack <Integer> s = new Stack<Integer>();
            s.push(10);
            s.pop();
            assertThrows(EmptyStackException.class, s::pop); //Verificação por uma chamada de testes, a partir da exceção passada como parâmetro
    }                                                        //no caso o pop, que remove o elemento do topo da pilha
}