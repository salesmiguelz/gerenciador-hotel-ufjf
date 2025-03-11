package observer;

import org.example.Cliente;
import org.example.ClienteComum;
import org.example.Reserva;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    public void deveNotificarUmCliente() {
        Reserva reserva = new Reserva();
        Cliente cliente = new ClienteComum();
        cliente.observarReserva(reserva);
        reserva.solicitar();
        assertEquals("Reserva foi atualizada para Solicitada", cliente.getUltimaNotificacao());
    }

    @Test
    public void deveNotificarVariosClientes() {
        Reserva reserva = new Reserva();
        Cliente cliente1 = new ClienteComum();
        Cliente cliente2 = new ClienteComum();
        cliente1.observarReserva(reserva);
        cliente2.observarReserva(reserva);
        reserva.pagar();
        assertEquals("Reserva foi atualizada para Paga", cliente1.getUltimaNotificacao());
        assertEquals("Reserva foi atualizada para Paga", cliente2.getUltimaNotificacao());
    }

    @Test
    public void naoDeveNotificarClienteSemObservacao() {
        Reserva reserva = new Reserva();
        Cliente cliente = new ClienteComum();
        reserva.solicitar();
        assertEquals(null, cliente.getUltimaNotificacao());
    }

    @Test
    public void deveNotificarClienteSomenteQuandoAlterarReserva() {
        Reserva reserva = new Reserva();
        Cliente cliente = new ClienteComum();
        cliente.observarReserva(reserva);
        reserva.pagar();
        assertEquals("Reserva foi atualizada para Paga", cliente.getUltimaNotificacao());
    }
}
