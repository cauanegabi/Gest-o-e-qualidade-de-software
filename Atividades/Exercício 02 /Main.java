import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorNotas gerenciador = new GerenciadorNotas();
        int opcao;

        do {
            System.out.println("\n MENU - GERENCIAMENTO DE NOTAS ");
            System.out.println("1️ Adicionar aluno e notas");
            System.out.println("2️ Exibir notas de um aluno");
            System.out.println("3️ Calcular média de um aluno");
            System.out.println("0️ Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = sc.nextLine();

                    ArrayList<Double> notas = new ArrayList<>();
                    String continuar;
                    do {
                        System.out.print("Digite uma nota: ");
                        double nota = sc.nextDouble();
                        notas.add(nota);
                        sc.nextLine();
                        System.out.print("Adicionar outra nota? (s/n): ");
                        continuar = sc.nextLine();
                    } while (continuar.equalsIgnoreCase("s"));

                    gerenciador.adicionarAluno(nome, notas);
                    break;

                case 2:
                    System.out.print("Digite o nome do aluno: ");
                    String nomeExibir = sc.nextLine();
                    gerenciador.exibirNotas(nomeExibir);
                    break;

                case 3:
                    System.out.print("Digite o nome do aluno: ");
                    String nomeMedia = sc.nextLine();
                    gerenciador.calcularMedia(nomeMedia);
                    break;

                case 0:
                    System.out.println(" Saindo do programa...");
                    break;

                default:
                    System.out.println(" Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
