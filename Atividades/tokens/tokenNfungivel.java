package tokens;

public class tokenNfungivel extends Token {
    private String idUnico;

    public tokenNfungivel(String nome, double valor, String idUnico) {
        super(nome, valor);
        this.idUnico = idUnico;
    }
    public String detalhes() {
        return String.format("Token Não Fungível: %s, Valor: %.2f, ID Único: %s", nome, valor, idUnico);
    }
}