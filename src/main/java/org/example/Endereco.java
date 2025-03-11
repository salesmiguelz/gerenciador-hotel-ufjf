package org.example;

public class Endereco implements Cloneable{
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;

    // Construtor padrão
    public Endereco() {
    }

    // Construtor com parâmetros
    public Endereco(String rua, String numero, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    // Getters e Setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    // Método toString para exibir o endereço de forma legível
    @Override
    public String toString() {
        return "Endereço: " + rua + ", nº " + numero + ", " + cidade + " - " + estado + " - " + "CEP: " + cep;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
