package org.example;

public class ServicoPiscina implements IServico{
    public String confirmar() {
        return "Serviço Piscina confirmado!";
    }

    public String cancelar() {
        return "Serviço Piscina cancelado!";
    }
}
