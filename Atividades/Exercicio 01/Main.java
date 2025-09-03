import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist();
        int opcao;

        do {
            System.out.println("\n MENU - GERENCIADOR DE PLAYLIST ");
            System.out.println("1️ Adicionar música");
            System.out.println("2️ Remover música");
            System.out.println("3️ Listar músicas");
            System.out.println("4️ Exibir duração total");
            System.out.println("0️ Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título da música: ");
                    String titulo = sc.nextLine();
                    System.out.print("Digite o artista: ");
                    String artista = sc.nextLine();
                    System.out.print("Digite a duração em minutos: ");
                    double duracao = sc.nextDouble();
                    sc.nextLine(); // limpar buffer

                    Musica m = new Musica(titulo, artista, duracao);
                    playlist.adicionarMusica(m);
                    break;

                case 2:
                    System.out.print("Digite o título da música a remover: ");
                    String tituloRemover = sc.nextLine();
                    playlist.removerMusica(tituloRemover);
                    break;

                case 3:
                    playlist.listarMusicas();
                    break;

                case 4:
                    System.out.println(" Duração total da playlist: " + playlist.duracaoTotal() + " minutos");
                    break;

                case 0:
                    System.out.println(" Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
