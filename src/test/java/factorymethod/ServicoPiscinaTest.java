package factorymethod;

import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoPiscinaTest {

    @Test
    void deveConfirmarPiscina() {
        IServico servico = ServicoFactory.obterServico("Piscina");
        assertEquals("Serviço Piscina confirmado!", servico.confirmar());
    }

    @Test
    void deveCancelarPiscina() {
        IServico servico = ServicoFactory.obterServico("Piscina");
        assertEquals("Serviço Piscina cancelado!", servico.cancelar());
    }
}
