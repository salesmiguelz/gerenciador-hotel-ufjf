package org.example;

public class QuartoBasico implements Quarto{

    @Override
    public String getDescricao() {
        return "Quarto Básico";
    }

    @Override
    public double getCusto() {
        return 100.0;
    }

}