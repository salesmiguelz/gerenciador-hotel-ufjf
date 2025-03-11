package org.example;

public class QuartoComTV extends QuartoDecorator {
    public QuartoComTV(Quarto quarto) {
        super(quarto);
    }

    @Override
    public String getDescricao() {
        return quarto.getDescricao() + ", com TV";
    }

    @Override
    public double getCusto() {
        return quarto.getCusto() + 20.0;
    }

}
