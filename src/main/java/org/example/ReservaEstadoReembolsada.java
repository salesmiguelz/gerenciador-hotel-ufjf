package org.example;

public class ReservaEstadoReembolsada extends ReservaEstado{

    private ReservaEstadoReembolsada(){};
    private static ReservaEstadoReembolsada instance = new ReservaEstadoReembolsada();
    public static ReservaEstadoReembolsada getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Reembolsada";
    }
}
