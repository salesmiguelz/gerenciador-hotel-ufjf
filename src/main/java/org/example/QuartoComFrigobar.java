package org.example;

public class QuartoComFrigobar extends QuartoDecorator {

    public QuartoComFrigobar(Quarto quarto) {
        super(quarto);
    }

    @Override
    public String getDescricao() {
        return quarto.getDescricao() + ", com Frigobar";
    }

    @Override
    public double getCusto() {
        return quarto.getCusto() + 30.0; // Custo adicional por ter frigobar
    }

}