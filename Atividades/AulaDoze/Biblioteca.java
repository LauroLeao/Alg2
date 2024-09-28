package Atividades.AulaDoze;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void registrarEmprestimo(Livro livro, String nomeEmprestado, String dataDevolucao) {
        if (!livro.isEmprestado()) {
            livro.setEmprestado(true);
            livro.setNomeEmprestado(nomeEmprestado);
            livro.setDataDevolucao(dataDevolucao);
            emprestimos.add(new Emprestimo(livro, nomeEmprestado, dataDevolucao));
            System.out.println("Empréstimo registrado com sucesso!");
        } else {
            System.out.println("Livro já está emprestado.");
        }
    }

    public void verificarDisponibilidade(Livro livro) {
        if (livro.isEmprestado()) {
            System.out.println("Livro está emprestado.");
        } else {
            System.out.println("Livro está disponível.");
        }
    }

    public void listarEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
            System.out.println("Nome emprestado: " + emprestimo.getNomeEmprestado());
            System.out.println("Data de devolução: " + emprestimo.getDataDevolucao());
            System.out.println();
        }
    }
}