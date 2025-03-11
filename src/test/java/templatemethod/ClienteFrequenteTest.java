package templatemethod;

import org.example.ClientePremium;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ClienteFrequenteTest {
    @Test
    public void deveRetornarNaoPodeAlugar() {
        ClientePremium cliente = new ClientePremium();
        cliente.setNumeroReservas(4);
        assertFalse(cliente.podeAlugarSuite());
    }

    @Test
    public void deveRetornarPodeAlugar() {
        ClientePremium cliente = new ClientePremium();
        cliente.setNumeroReservas(5);
        assertTrue(cliente.podeAlugarSuite());
    }
}
