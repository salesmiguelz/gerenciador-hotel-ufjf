package factorymethod;

import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoComidaQuartoTest {

    @Test
    void deveConfirmarComidaQuarto() {
        IServico servico = ServicoFactory.obterServico("ComidaQuarto");
        assertEquals("Serviço de Comida de Quarto confirmado!", servico.confirmar());
    }

    @Test
    void deveCancelarComidaQuarto() {
        IServico servico = ServicoFactory.obterServico("ComidaQuarto");
        assertEquals("Serviço de Comida de Quarto cancelada!", servico.cancelar());
    }
}
