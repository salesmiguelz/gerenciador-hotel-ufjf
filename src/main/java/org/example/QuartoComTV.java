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

    public Quarto clone() {
        try {
            return (Quarto) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar quarto", e);
        }
    }
}
