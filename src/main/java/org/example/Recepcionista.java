package org.example;

public class Recepcionista {

    private static Recepcionista instancia = new Recepcionista();

    private Recepcionista() {}

    public static Recepcionista getInstancia() {
        return instancia;
    }

    public String receberElogioRestaurante(String mensagem) {
        return "A Recepção agradece seu elogio para o restaurante!\n" +
                "Mensagem: " + Restaurante.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoRestaurante(String mensagem) {
        return "A Recepção vai procurar resolver a seguinte reclamação sobre o restaurante:\n" +
                "Mensagem: " + Restaurante.getInstancia().receberReclamacao(mensagem);
    }

    public String receberElogioLimpeza(String mensagem) {
        return "A Recepção agradece seu elogio para a limpeza!\n" +
                "Mensagem: " + Limpeza.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoLimpeza(String mensagem) {
        return "A Recepção vai procurar resolver a seguinte reclamação sobre a limpeza:\n" +
                "Mensagem: " + Limpeza.getInstancia().receberReclamacao(mensagem);
    }

}
