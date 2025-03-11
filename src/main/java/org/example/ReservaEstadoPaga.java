package org.example;

public class ReservaEstadoPaga extends ReservaEstado{
    private ReservaEstadoPaga(){};
    private static ReservaEstadoPaga instance = new ReservaEstadoPaga();
    public static ReservaEstadoPaga getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Paga";
    }

    public boolean realizarCheckIn(Reserva reserva){
        reserva.setEstado(ReservaEstadoCheckIn.getInstance());
        return true;
    }

    public boolean reembolsar(Reserva reserva){
        reserva.setEstado(ReservaEstadoReembolsada.getInstance());
        return true;
    }
}
