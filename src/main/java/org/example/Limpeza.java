package org.example;

public class Limpeza implements Setor {

    private static Limpeza instancia = new Limpeza();

    private Limpeza() {}

    public static Limpeza getInstancia() {
        return instancia;
    }

    @Override
    public String receberReclamacao(String mensagem) {
        return "A Limpeza vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    @Override
    public String receberElogio(String mensagem) {
        return "A Limpeza agradece o elogio: " + mensagem;
    }

}