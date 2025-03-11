package org.example;

public class Recepcionista implements Setor {

    private static Recepcionista instancia = new Recepcionista();

    private Recepcionista() {}

    public static Recepcionista getInstancia() {
        return instancia;
    }

    @Override
    public String receberReclamacao(String mensagem) {
        return "A Recepção vai procurar resolver a reclamação: " + mensagem;
    }

    @Override
    public String receberElogio(String mensagem) {
        return "A Recepção agradece o elogio: " + mensagem;
    }
}