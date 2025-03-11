package org.example;

public class CentralDeServicos{
    private static CentralDeServicos instancia = new CentralDeServicos();

    private CentralDeServicos() {}

    public static CentralDeServicos getInstancia() {
        return instancia;
    }

    public String enviarReclamacao(String mensagem, Setor setor) {
        return "A Central de Serviços agradece seu contato.\n" +
                "O setor respondeu sua reclamação conforme mensagem a seguir.\n" +
                ">>" + setor.receberReclamacao(mensagem);
    }

    public String enviarElogio(String mensagem, Setor setor) {
        return "A Central de Serviços agradece seu contato.\n" +
                "O setor respondeu seu elogio conforme mensagem a seguir.\n" +
                ">>" + setor.receberElogio(mensagem);
    }

}