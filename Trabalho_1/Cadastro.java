import java.util.HashMap;
import java.util.Map;

public class Cadastro {
    private Map<String, Aluno> alunos;

    public Cadastro() {
        this.alunos = new HashMap<>();
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.put(aluno.getNome(), aluno);
    }

    public Aluno buscarAluno(String nome) {
        return alunos.get(nome);
    }

    public void atribuirTreino(String nomeAluno, Treino treino) {
        Aluno aluno = alunos.get(nomeAluno);
        if (aluno != null) {
            aluno.setPlanoTreino(treino); // Atribui o treino ao aluno
        }
    }
    
}
