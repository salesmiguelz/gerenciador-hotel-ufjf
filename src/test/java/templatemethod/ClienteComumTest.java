package templatemethod;

import org.example.ClienteComum;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ClienteComumTest {
    @Test
    public void deveRetornarNaoPodeAlugar() {
        ClienteComum cliente = new ClienteComum();
        cliente.setNumeroReservas(9);
        assertFalse(cliente.podeAlugarSuite());
    }

    @Test
    public void deveRetornarPodeAlugar() {
        ClienteComum cliente = new ClienteComum();
        cliente.setNumeroReservas(10);
        assertTrue(cliente.podeAlugarSuite());
    }
}
