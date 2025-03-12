package org.example;

public class RelatorioCliente implements Relatorio{

    Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public RelatorioCliente(Cliente cliente){this.cliente = cliente;};

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirCliente(this);
    }
}
