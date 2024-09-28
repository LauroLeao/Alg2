package Atividades.AulaCinco;

import java.util.ArrayList;
import java.util.List;

public class carrinho {
    private List<produto> produtos;

    public carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarproduto(produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(produto produto) {
        produtos.remove(produto);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
}