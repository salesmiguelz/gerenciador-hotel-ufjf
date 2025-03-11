package org.example;

public class ReservaEstadoCheckIn extends ReservaEstado{

    private ReservaEstadoCheckIn(){};
    private static ReservaEstadoCheckIn instance = new ReservaEstadoCheckIn();
    public static ReservaEstadoCheckIn getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Check-In";
    }

    public boolean realizarCheckOut(Reserva reserva){
        reserva.setEstado(ReservaEstadoPaga.getInstance());
        return true;
    }

}
