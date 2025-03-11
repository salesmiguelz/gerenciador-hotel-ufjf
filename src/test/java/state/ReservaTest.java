package state;

import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReservaTest {

    private Reserva reserva;

    @BeforeEach
    public void setUp() {
        reserva = new Reserva();
    }

    // Reserva solicitada
    @Test
    public void devePagarReservaSolicitada() {
        reserva.setEstado(ReservaEstadoSolicitada.getInstance());
        assertTrue(reserva.getEstado().pagar(reserva));
        assertEquals(ReservaEstadoPaga.getInstance(), reserva.getEstado());
    }

    @Test
    public void deveCancelarReservaSolicitada() {
        reserva.setEstado(ReservaEstadoSolicitada.getInstance());
        assertTrue(reserva.getEstado().cancelar(reserva));
        assertEquals(ReservaEstadoCancelada.getInstance(), reserva.getEstado());
    }

    @Test
    public void naoDeveRealizarCheckInReservaSolicitada() {
        reserva.setEstado(ReservaEstadoSolicitada.getInstance());
        assertFalse(reserva.getEstado().realizarCheckIn(reserva));
    }

    // Reserva paga
    @Test
    public void deveRealizarCheckInReservaPaga() {
        reserva.setEstado(ReservaEstadoPaga.getInstance());
        assertTrue(reserva.getEstado().realizarCheckIn(reserva));
        assertEquals(ReservaEstadoCheckIn.getInstance(), reserva.getEstado());
    }

    @Test
    public void deveReembolsarReservaPaga() {
        reserva.setEstado(ReservaEstadoPaga.getInstance());
        assertTrue(reserva.getEstado().reembolsar(reserva));
        assertEquals(ReservaEstadoReembolsada.getInstance(), reserva.getEstado());
    }

    // Reserva cancelada
    @Test
    public void naoDevePagarReservaCancelada() {
        reserva.setEstado(ReservaEstadoCancelada.getInstance());
        assertFalse(reserva.getEstado().pagar(reserva));
    }

    // Reserva em check-in
    @Test
    public void deveRealizarCheckOutReservaCheckIn() {
        reserva.setEstado(ReservaEstadoCheckIn.getInstance());
        assertTrue(reserva.getEstado().realizarCheckOut(reserva));
        assertEquals(ReservaEstadoPaga.getInstance(), reserva.getEstado());
    }

    // Reserva em check-out
    @Test
    public void deveReembolsarReservaCheckOut() {
        reserva.setEstado(ReservaEstadoCheckOut.getInstance());
        assertTrue(reserva.getEstado().reembolsar(reserva));
        assertEquals(ReservaEstadoReembolsada.getInstance(), reserva.getEstado());
    }

    // Reserva reembolsada
    @Test
    public void naoDevePagarReservaReembolsada() {
        reserva.setEstado(ReservaEstadoReembolsada.getInstance());
        assertFalse(reserva.getEstado().pagar(reserva));
    }
}
