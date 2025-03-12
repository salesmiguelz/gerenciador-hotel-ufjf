package visitor;

import org.example.*;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class RelatorioHTMLVisitorTest {

    @Test
    public void deveExibirClienteHTML() {
        Cliente cliente = new ClienteComum();
        cliente.setNome("João Silva");
        cliente.setEndereco(new Endereco("Rua das FLores", "123", "Juiz de Fora", "MG", "36000-000"));
        cliente.setNumeroReservas(3);

        RelatorioCliente relatorioCliente = new RelatorioCliente(cliente);
        RelatorioHTMLVisitor visitor = new RelatorioHTMLVisitor();
        String resultado = visitor.exibirCliente(relatorioCliente);

        String esperado = "<div class=\"cliente\">\n" +
                "  <h2>Cliente: João Silva</h2>\n" +
                "  <p>Número de Reservas: 3</p>\n" +
                "</div>\n";

        assertEquals(esperado, resultado);
    }

    @Test
    public void deveExibirReservaHTML() {
        Reserva reserva = new Reserva();
        reserva.setData(new Date(1672531200000L)); // 1 de janeiro de 2023
        reserva.setQuarto(new QuartoBasico());

        RelatorioReserva relatorioReserva = new RelatorioReserva(reserva);
        RelatorioHTMLVisitor visitor = new RelatorioHTMLVisitor();
        String resultado = visitor.exibirReserva(relatorioReserva);

        String esperado = "<div class=\"reserva\">\n" +
                "  <h2>Reserva</h2>\n" +
                "  <p>Quarto: Quarto Básico</p>\n" +
                "</div>\n";

        assertEquals(esperado, resultado);
    }
}