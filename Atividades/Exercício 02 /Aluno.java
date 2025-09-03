import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Double> notas;

    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) return 0;
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        return soma / notas.size();
    }

    @Override
    public String toString() {
        return " - " + nome + " - Notas: " + notas.toString() + 
               " | Média: " + String.format("%.2f", calcularMedia());
    }
}
