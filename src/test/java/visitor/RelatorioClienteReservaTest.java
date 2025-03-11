package visitor;

import org.example.*;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class RelatorioClienteReservaTest {
    @Test
    public void deveExibirCliente() {
        Cliente cliente = new ClienteComum();
        cliente.setNome("Cliente 1");
        cliente.setNumeroReservas(3);
        RelatorioClienteReservaVisitor visitor = new RelatorioClienteReservaVisitor();
        assertEquals("Cliente{nome=Cliente 1, numeroReservas=3}", visitor.exibirCliente(cliente));
    }

    @Test
    public void deveExibirReserva() {
        Reserva reserva = new Reserva();
        reserva.setData(new Date());
        reserva.setEstado(ReservaEstadoSolicitada.getInstance());
        RelatorioClienteReservaVisitor visitor = new RelatorioClienteReservaVisitor();
        assertEquals("Reserva{data=" + reserva.getData() + ", estado='Solicitada'}", visitor.exibirReserva(reserva));
    }
}
