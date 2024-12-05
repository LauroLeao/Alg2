package EXreforco;

public class pessoa {
    private String nome;
    private int idade;
    private String cpf;


    public pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", CPF: " + cpf);
    }
}