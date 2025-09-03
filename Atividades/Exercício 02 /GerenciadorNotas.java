import java.util.ArrayList;
import java.util.HashMap;

public class GerenciadorNotas {
    private HashMap<String, Aluno> alunos;

    public GerenciadorNotas() {
        alunos = new HashMap<>();
    }

    public void adicionarAluno(String nome, ArrayList<Double> notas) {
        Aluno aluno = new Aluno(nome);
        for (double n : notas) {
            aluno.adicionarNota(n);
        }
        alunos.put(nome, aluno);
        System.out.println("Aluno " + nome + " cadastrado com sucesso!");
    }

    public void exibirNotas(String nome) {
        Aluno aluno = alunos.get(nome);
        if (aluno != null) {
            System.out.println(aluno);
        } else {
            System.out.println("Aluno não encontrado: " + nome);
        }
    }

    public void calcularMedia(String nome) {
        Aluno aluno = alunos.get(nome);
        if (aluno != null) {
            System.out.println("Média de " + nome + ": " + String.format("%.2f", aluno.calcularMedia()));
        } else {
            System.out.println("Aluno não encontrado: " + nome);
        }
    }
}
