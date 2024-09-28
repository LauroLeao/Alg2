package Atividades.AulaCinco;

public class Cliente {
    private String nome;
    private Atividades.AulaCinco.carrinho carrinho;

    public Cliente(String nome) {
        this.nome = nome;
        this.carrinho = new carrinho();
    }

    public void adicionarprodutoAocarrinho(produto produto) {
        carrinho.adicionarproduto(produto);
    }

    public void removerprodutoDocarrinho(produto produto) {
        carrinho.removerProduto(produto);
    }

    public double visualizarValortotal() {
        return carrinho.calcularValorTotal();
    }
}

