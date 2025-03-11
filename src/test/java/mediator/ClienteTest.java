package mediator;

import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarRestaurante() {
        Cliente cliente = new ClienteComum();
        Setor restaurante = Restaurante.getInstancia();
        assertEquals("A Central de Serviços agradece seu contato.\n" +
                        "O setor respondeu seu elogio conforme mensagem a seguir.\n" +
                        ">>O Restaurante agradece o elogio: Excelente comida!",
                cliente.elogiar("Excelente comida!", restaurante));
    }

    @Test
    void deveReclamarRestaurante() {
        Cliente cliente = new ClienteComum();
        Setor restaurante = Restaurante.getInstancia();
        assertEquals("A Central de Serviços agradece seu contato.\n" +
                        "O setor respondeu sua reclamação conforme mensagem a seguir.\n" +
                        ">>O Restaurante vai procurar melhorar o serviço da reclamação: Atendimento lento",
                cliente.reclamar("Atendimento lento", restaurante));
    }

    @Test
    void deveElogiarRecepcionista() {
        Cliente cliente = new ClienteComum();
        Setor recepcionista = Recepcionista.getInstancia();
        assertEquals("A Central de Serviços agradece seu contato.\n" +
                        "O setor respondeu seu elogio conforme mensagem a seguir.\n" +
                        ">>A Recepção agradece o elogio: Muito simpática!",
                cliente.elogiar("Muito simpática!", recepcionista));
    }

    @Test
    void deveReclamarRecepcionista() {
        Cliente cliente = new ClienteComum();
        Setor recepcionista = Recepcionista.getInstancia();
        assertEquals("A Central de Serviços agradece seu contato.\n" +
                        "O setor respondeu sua reclamação conforme mensagem a seguir.\n" +
                        ">>A Recepção vai procurar resolver a reclamação: Falta de cordialidade",
                cliente.reclamar("Falta de cordialidade", recepcionista));
    }

}
