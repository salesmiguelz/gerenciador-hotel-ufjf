package org.example;

public abstract class ReservaEstado {
    public abstract String getEstado();
    public boolean solicitar(Reserva reserva) {
        return false;
    }

    public boolean pagar(Reserva reserva) {
        return false;
    }

    public boolean cancelar(Reserva reserva) {
        return false;
    }

    public boolean realizarCheckIn(Reserva reserva) {
        return false;
    }

    public boolean realizarCheckOut(Reserva reserva) {
        return false;
    }

    public boolean reembolsar(Reserva reserva){
        return false;
    }
}
