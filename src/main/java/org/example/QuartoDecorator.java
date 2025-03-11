package org.example;

public abstract class QuartoDecorator implements Quarto {
    protected Quarto quarto;

    public QuartoDecorator(Quarto quarto) {
        this.quarto = quarto;
    }

    @Override
    public String getDescricao() {
        return quarto.getDescricao();
    }

    @Override
    public double getCusto() {
        return quarto.getCusto();
    }
}