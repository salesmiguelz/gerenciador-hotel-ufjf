package prototype;

import org.example.Cliente;
import org.example.ClienteComum;
import org.example.Endereco;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Endereco enderecoOriginal = new Endereco("Rua A", "10", "Juiz de Fora", "MG", "36000-000");
        Cliente cliente = new ClienteComum();
        cliente.setEndereco(enderecoOriginal);

        Cliente clienteClone = cliente.clone();
        clienteClone.setNome("Gabriel Barbosa");
        clienteClone.getEndereco().setNumero("20");

        assertEquals("10", cliente.getEndereco().getNumero());
        assertEquals("20", clienteClone.getEndereco().getNumero());
    }
}
