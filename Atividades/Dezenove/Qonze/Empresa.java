package Atividades.Dezenove.Qonze;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private String cnpj;
    private List<Funcionario> funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void contratarFuncionario(Funcionario funcionario) {
        if (funcionario != null) {
            funcionarios.add(funcionario);
            System.out.println("Funcionário contratado com sucesso!");
        } else {
            System.out.println("Erro ao contratar funcionário.");
        }
    }

    public void demitirFuncionario(Funcionario funcionario) {
        if (funcionarios.contains(funcionario)) {
            funcionarios.remove(funcionario);
            System.out.println("Funcionário demitido com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Cargo: " + funcionario.getCargo());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println();
        }
    }
}