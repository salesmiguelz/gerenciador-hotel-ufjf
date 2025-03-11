package decorator;

import org.example.Quarto;
import org.example.QuartoBasico;
import org.example.QuartoComFrigobar;
import org.example.QuartoComTV;
import org.example.Reserva;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuartoTest {

    @Test
    void deveRetornarDescricaoQuartoBasico() {
        Quarto quarto = new QuartoBasico();
        Reserva reserva = new Reserva();
        reserva.setQuarto(quarto);
        assertEquals("Quarto Básico", reserva.getQuarto().getDescricao());
    }

    @Test
    void deveRetornarCustoQuartoBasico() {
        Quarto quarto = new QuartoBasico();
        Reserva reserva = new Reserva();
        reserva.setQuarto(quarto);
        assertEquals(100.0, reserva.getQuarto().getCusto());
    }

    @Test
    void deveRetornarDescricaoQuartoComFrigobar() {
        Quarto quarto = new QuartoComFrigobar(new QuartoBasico());
        Reserva reserva = new Reserva();
        reserva.setQuarto(quarto);
        assertEquals("Quarto Básico, com Frigobar", reserva.getQuarto().getDescricao());
    }

    @Test
    void deveRetornarCustoQuartoComFrigobar() {
        Quarto quarto = new QuartoComFrigobar(new QuartoBasico());
        Reserva reserva = new Reserva();
        reserva.setQuarto(quarto);
        assertEquals(130.0, reserva.getQuarto().getCusto());
    }

    @Test
    void deveRetornarDescricaoQuartoComTV() {
        Quarto quarto = new QuartoComTV(new QuartoBasico());
        Reserva reserva = new Reserva();
        reserva.setQuarto(quarto);
        assertEquals("Quarto Básico, com TV", reserva.getQuarto().getDescricao());
    }

    @Test
    void deveRetornarCustoQuartoComTV() {
        Quarto quarto = new QuartoComTV(new QuartoBasico());
        Reserva reserva = new Reserva();
        reserva.setQuarto(quarto);
        assertEquals(120.0, reserva.getQuarto().getCusto());
    }

    @Test
    void deveRetornarDescricaoQuartoComFrigobarETV() {
        Quarto quarto = new QuartoComTV(new QuartoComFrigobar(new QuartoBasico()));
        Reserva reserva = new Reserva();
        reserva.setQuarto(quarto);
        assertEquals("Quarto Básico, com Frigobar, com TV", reserva.getQuarto().getDescricao());
    }

    @Test
    void deveRetornarCustoQuartoComFrigobarETV() {
        Quarto quarto = new QuartoComTV(new QuartoComFrigobar(new QuartoBasico()));
        Reserva reserva = new Reserva();
        reserva.setQuarto(quarto);
        assertEquals(150.0, reserva.getQuarto().getCusto());
    }
}
