package org.example;

public class Restaurante implements Setor {

    private static Restaurante instancia = new Restaurante();

    private Restaurante() {}

    public static Restaurante getInstancia() {
        return instancia;
    }

    @Override
    public String receberReclamacao(String mensagem) {
        return "O Restaurante vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    @Override
    public String receberElogio(String mensagem) {
        return "O Restaurante agradece o elogio: " + mensagem;
    }

}
