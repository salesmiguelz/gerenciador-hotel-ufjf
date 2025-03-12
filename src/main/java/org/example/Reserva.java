package org.example;

import java.util.Date;
import java.util.Observable;


public class Reserva extends Observable{
    private ReservaEstado estado;
    private Date data;
    private Quarto quarto;
    public Reserva(){
        this.estado = ReservaEstadoSolicitada.getInstance();
    }
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public void setEstado(ReservaEstado estado) {
        this.estado = estado;
    }

    public ReservaEstado getEstado() {
        return estado;
    }

    public boolean cancelar() {
        boolean novoEstado = estado.cancelar(this);
        setChanged();
        notifyObservers();
        return novoEstado;
    }

    public boolean solicitar() {
        boolean novoEstado = estado.solicitar(this);
        setChanged();
        notifyObservers();
        return novoEstado;
    }

    public boolean realizarCheckIn()
    {
        boolean novoEstado = estado.realizarCheckIn(this);
        setChanged();
        notifyObservers();
        return novoEstado;
    }

    public boolean realizarCheckOut()
    {
        boolean novoEstado = estado.realizarCheckOut(this);
        setChanged();
        notifyObservers();
        return novoEstado;
    }

    public boolean pagar(){
        boolean novoEstado = estado.pagar(this);
        setChanged();
        notifyObservers();
        return novoEstado;
    }
}
