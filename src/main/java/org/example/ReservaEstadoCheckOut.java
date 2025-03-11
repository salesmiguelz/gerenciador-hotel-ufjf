package org.example;

public class ReservaEstadoCheckOut extends ReservaEstado{
    private ReservaEstadoCheckOut(){};
    private static ReservaEstadoCheckOut instance = new ReservaEstadoCheckOut();
    public static ReservaEstado getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Check-Out";
    }

    public boolean reembolsar(Reserva reserva){
        reserva.setEstado(ReservaEstadoReembolsada.getInstance());
        return true;
    }
}
