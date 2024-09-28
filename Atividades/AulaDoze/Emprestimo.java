package Atividades.AulaDoze;

public class Emprestimo {
    private Livro livro;
    private String nomeEmprestado;
    private String dataDevolucao;

    public Emprestimo(Livro livro, String nomeEmprestado, String dataDevolucao) {
        this.livro = livro;
        this.nomeEmprestado = nomeEmprestado;
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public String getNomeEmprestado() {
        return nomeEmprestado;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }
}