package org.example;

public class RelatorioReserva implements Relatorio{
    Reserva reserva;

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public RelatorioReserva(Reserva reserva){this.reserva = reserva;}
    public String aceitar(Visitor visitor) {
        return visitor.exibirReserva(this);
    }
}
