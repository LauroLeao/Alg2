package tokens;

// TokenFungivel.java
public class tokenfungivel extends Token {
    private int quantidade;

    public tokenfungivel(String nome, double valor, int quantidade) {
        super(nome, valor);
        this.quantidade = quantidade;
    }
    public String detalhes() {
        return String.format("Token Fungível: %s, Valor: %.2f, Quantidade: %d", nome, valor, quantidade);
    }
}