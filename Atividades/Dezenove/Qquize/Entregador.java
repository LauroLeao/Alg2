package Atividades.Dezenove.Qquize;

import java.util.ArrayList;
import java.util.List;

public class Entregador {
    private List<Pedido> pedidos;

    public Entregador() {
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void registrarEntrega(Pedido pedido) {
        pedido.setEntregue(true);
        System.out.println("Pedido entregue com sucesso!");
    }

    public void listarPedidos() {
        for (Pedido pedido : pedidos) {
            System.out.println("Cliente: " + pedido.getCliente().getNome());
            System.out.println("Produto: " + pedido.getProduto().getDescricao());
            System.out.println("Data de entrega: " + pedido.getDataEntrega());
            System.out.println("Hora de entrega: " + pedido.getHoraEntrega());
            System.out.println("Entregue: " + (pedido.isEntregue() ? "Sim" : "Não"));
            System.out.println();
        }
    }
}