package Atividades.Dezenove.Qquize;

public class Pedido {
    private Cliente cliente;
    private Produto produto;
    private String dataEntrega;
    private String horaEntrega;
    private boolean entregue;

    public Pedido(Cliente cliente, Produto produto, String dataEntrega, String horaEntrega) {
        this.cliente = cliente;
        this.produto = produto;
        this.dataEntrega = dataEntrega;
        this.horaEntrega = horaEntrega;
        this.entregue = false;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public String getHoraEntrega() {
        return horaEntrega;
    }

    public boolean isEntregue() {
        return entregue;
    }

    public void setEntregue(boolean entregue) {
        this.entregue = entregue;
    }
}