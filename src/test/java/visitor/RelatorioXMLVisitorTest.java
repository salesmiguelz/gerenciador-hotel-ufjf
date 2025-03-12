package visitor;

import org.example.*;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class RelatorioXMLVisitorTest {
    @Test
    public void deveExibirClienteXML() {
        Cliente cliente = new ClienteComum();
        cliente.setNome("Maria Oliveira");
        cliente.setEndereco(new Endereco());
        cliente.setNumeroReservas(5);

        RelatorioCliente relatorioCliente = new RelatorioCliente(cliente);
        RelatorioXMLVisitor visitor = new RelatorioXMLVisitor();
        String resultado = visitor.exibirCliente(relatorioCliente);

        String esperado = "<cliente>\n" +
                "  <nome>Maria Oliveira</nome>\n" +
                "  <numeroReservas>5</numeroReservas>\n" +
                "</cliente>\n";

        assertEquals(esperado, resultado);
    }

    @Test
    public void deveExibirReservaXML() {
        Reserva reserva = new Reserva();
        reserva.setData(new Date(1672531200000L));
        reserva.setQuarto(new QuartoBasico());

        RelatorioReserva relatorioReserva = new RelatorioReserva(reserva);
        RelatorioXMLVisitor visitor = new RelatorioXMLVisitor();
        String resultado = visitor.exibirReserva(relatorioReserva);

        String esperado = "<reserva>\n" +
                "  <quarto>Quarto Básico</quarto>\n" +
                "</reserva>\n";

        assertEquals(esperado, resultado);
    }
}
