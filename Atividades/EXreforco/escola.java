package EXreforco;

import java.util.ArrayList;
import java.util.List;

public class escola {
    private List<pessoa> pessoas = new ArrayList<>();


    public void adicionarPessoa(pessoa pessoa) {
        pessoas.add(pessoa);
        pessoa.exibirInformacoes();
    }
}