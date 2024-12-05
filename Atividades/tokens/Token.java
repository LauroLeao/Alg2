package tokens;

public abstract class Token {
    protected String nome;
    protected double valor;

    public Token(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public abstract String detalhes();
}