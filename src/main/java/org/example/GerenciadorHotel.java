package org.example;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorHotel {
    private List<Cliente> clientes;

    public GerenciadorHotel() {
        this.clientes = new ArrayList<>();
    }
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void criarReserva(String nomeCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nomeCliente) ) {
                cliente.setNumeroReservas(cliente.getNumeroReservas() + 1);
                return;
            }
        }
    }
}