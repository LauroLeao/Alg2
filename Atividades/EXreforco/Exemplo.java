package EXreforco;

public class Exemplo {
    public static void main(String[] args) {

        aluno aluno1 = new aluno("Lauro", 19, "1234567", "001");
        professor professor1 = new professor("Alysson", 40, "12345678", 5000.00);

        disciplina disciplina1 = new disciplina("Alg2");
        disciplina disciplina2 = new disciplina("Estrutura De Dados");

        aluno1.matricularEmDisciplina(disciplina1.getNome());
        aluno1.matricularEmDisciplina(disciplina2.getNome());

        professor1.atribuirDisciplina(disciplina1.getNome());
        professor1.atribuirDisciplina(disciplina2.getNome());

        escola escola = new escola();
        escola.adicionarPessoa(aluno1);
        escola.adicionarPessoa(professor1);
    }
}