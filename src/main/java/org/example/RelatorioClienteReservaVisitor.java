package org.example;

public class RelatorioClienteReservaVisitor implements Visitor{
    public String exibirCliente(Cliente cliente) {
        return "Cliente{" +
                "nome=" + cliente.getNome() +
                ", numeroReservas=" + cliente.getNumeroReservas() +
                '}';
    }

    public String exibirReserva(Reserva reserva) {
        return "Reserva{" +
                "data=" + reserva.getData() +
                ", estado='" + reserva.getEstado().getEstado() + '\'' +
         '}';
    }
}
