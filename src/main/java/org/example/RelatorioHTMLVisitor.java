package org.example;

public class RelatorioHTMLVisitor implements Visitor{
    public String exibirCliente(RelatorioCliente relatorio) {
        StringBuilder html = new StringBuilder();
        html.append("<div class=\"cliente\">\n");
        html.append("  <h2>Cliente: ").append(relatorio.getCliente().getNome()).append("</h2>\n");
        html.append("  <p>Número de Reservas: ").append(relatorio.getCliente().getNumeroReservas()).append("</p>\n");
        html.append("</div>\n");
        return html.toString();
    }

    public String exibirReserva(RelatorioReserva relatorio) {
        StringBuilder html = new StringBuilder();
        html.append("<div class=\"reserva\">\n");
        html.append("  <h2>Reserva</h2>\n");
        html.append("  <p>Quarto: ").append(relatorio.getReserva().getQuarto().getDescricao()).append("</p>\n");
        html.append("</div>\n");
        return html.toString();
    }
}
