package Atividades.Dezenove.Qquize;

public class Produto {
    private String descricao;
    private double peso;
    private double valor;

    public Produto(String descricao, double peso, double valor) {
        this.descricao = descricao;
        this.peso = peso;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPeso() {
        return peso;
    }

    public double getValor() {
        return valor;
    }
}