package org.example;

import java.util.*;

public abstract class Cliente implements Observer, Cloneable {
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


    public String elogiarRestaurante(String mensagem) {
        return Recepcionista.getInstancia().receberElogioRestaurante(mensagem);
    }

    public String reclamarRestaurante(String mensagem) {
        return Recepcionista.getInstancia().receberReclamacaoRestaurante(mensagem);
    }

    public String elogiarLimpeza(String mensagem) {
        return Recepcionista.getInstancia().receberElogioLimpeza(mensagem);
    }

    public String reclamarLimpeza(String mensagem) {
        return Recepcionista.getInstancia().receberReclamacaoLimpeza(mensagem);
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
