package EXreforco;

import java.util.ArrayList;
import java.util.List;

public class professor extends pessoa {
    private double salario;
    private List<String> disciplinas = new ArrayList<>();


    public professor(String nome, int idade, String cpf, double salario) {
        super(nome, idade, cpf);
        this.salario = salario;
    }
    public void atribuirDisciplina(String disciplina) {
        disciplinas.add(disciplina);
    }
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Salário: " + salario + ", Disciplinas: " + disciplinas);
    }
}