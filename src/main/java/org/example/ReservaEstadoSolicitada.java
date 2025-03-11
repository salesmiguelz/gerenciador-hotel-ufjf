package org.example;

public class ReservaEstadoSolicitada extends ReservaEstado{
    private ReservaEstadoSolicitada(){};
    private static ReservaEstadoSolicitada instance = new ReservaEstadoSolicitada();
    public static ReservaEstadoSolicitada getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Solicitada";
    }

    public boolean pagar(Reserva reserva){
        reserva.setEstado(ReservaEstadoPaga.getInstance());
        return true;
    }

    public boolean cancelar(Reserva reserva){
        reserva.setEstado(ReservaEstadoCancelada.getInstance());
        return true;
    }
}
