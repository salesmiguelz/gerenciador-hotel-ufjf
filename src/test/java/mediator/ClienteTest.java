package mediator;

import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarRestaurante() {
        Cliente cliente = new ClienteComum();
        assertEquals("A Recepção agradece seu elogio para o restaurante!\n" +
                        "Mensagem: O Restaurante agradece o elogio: Ótimo atendimento",
                cliente.elogiarRestaurante("Ótimo atendimento"));
    }

    @Test
    void deveReclamarRestaurante() {
        Cliente cliente = new ClienteComum();
        assertEquals("A Recepção vai procurar resolver a seguinte reclamação sobre o restaurante:\n" +
                        "Mensagem: O Restaurante vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                cliente.reclamarRestaurante("Lentidão no atendimento"));
    }

    @Test
    void deveElogiarLimpeza() {
        Cliente cliente = new ClienteComum();
        assertEquals("A Recepção agradece seu elogio para a limpeza!\n" +
                        "Mensagem: A Limpeza agradece o elogio: Excelente limpeza",
                cliente.elogiarLimpeza("Excelente limpeza"));
    }

    @Test
    void deveReclamarLimpeza() {
        Cliente cliente = new ClienteComum();
        assertEquals("A Recepção vai procurar resolver a seguinte reclamação sobre a limpeza:\n" +
                        "Mensagem: A Limpeza vai procurar melhorar o serviço da reclamação: Sujeira nos banheiros",
                cliente.reclamarLimpeza("Sujeira nos banheiros"));
    }
}
