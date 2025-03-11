package org.example;

import java.util.*;

public abstract class Cliente implements Observer, RelatorioClienteReserva, Cloneable {
    private List<Reserva> reservas = new ArrayList<>();
    private String nome;
    private Endereco endereco;
    private int numeroReservas;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    private String ultimaNotificacao;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroReservas() {
        return numeroReservas;
    }

    public void setNumeroReservas(int numeroReservas) {
        this.numeroReservas = numeroReservas;
    }

    public abstract Boolean podeAlugarSuite();

    public String getUltimaNotificacao(){
        return this.ultimaNotificacao;
    }


    public String reclamar(String mensagem, Setor setor) {
        return CentralDeServicos.getInstancia().enviarReclamacao(mensagem, setor);
    }

    public String elogiar(String mensagem, Setor setor) {
        return CentralDeServicos.getInstancia().enviarElogio(mensagem, setor);
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCliente(this);
    }

    public void observarReserva(Reserva reserva) {
        reservas.add(reserva);
        reserva.addObserver(this);
    }

    public void update(Observable reserva, Object arg) {
        Reserva reservaObject = (Reserva) reserva;
        this.ultimaNotificacao = "Reserva foi atualizada para " + ((Reserva) reserva).getEstado().getEstado();
    }

    public Cliente clone() throws CloneNotSupportedException {
        Cliente clienteClone = (Cliente) super.clone();
        clienteClone.endereco = (Endereco) clienteClone.endereco.clone();
        return clienteClone;
    }
}
