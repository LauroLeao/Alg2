package EXreforco;

import java.util.ArrayList;
import java.util.List;

public class aluno extends pessoa {
    private String matricula;
    private List<String> disciplinas = new ArrayList<>();


    public aluno(String nome, int idade, String cpf, String matricula) {
        super(nome, idade, cpf);
        this.matricula = matricula;
    }
    public void matricularEmDisciplina(String disciplina) {
        disciplinas.add(disciplina);
    }
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Matrícula: " + matricula + ", Disciplinas: " + disciplinas);
    }
}