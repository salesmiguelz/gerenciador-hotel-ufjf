package org.example;

public class RelatorioXMLVisitor implements Visitor{
    public String exibirCliente(RelatorioCliente relatorioCliente) {
        StringBuilder xml = new StringBuilder();
        xml.append("<cliente>\n");
        xml.append("  <nome>").append(relatorioCliente.getCliente().getNome()).append("</nome>\n");
        xml.append("  <numeroReservas>").append(relatorioCliente.getCliente().getNumeroReservas()).append("</numeroReservas>\n");
        xml.append("</cliente>\n");
        return xml.toString();
    }

    public String exibirReserva(RelatorioReserva relatorioReserva) {
        StringBuilder xml = new StringBuilder();
        xml.append("<reserva>\n");
        xml.append("  <quarto>").append(relatorioReserva.getReserva().getQuarto().getDescricao()).append("</quarto>\n");
        xml.append("</reserva>\n");
        return xml.toString();
    }
}
