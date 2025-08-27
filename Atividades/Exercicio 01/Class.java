import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = new Playlist();

        // Adicionando algumas músicas do Fernandinho à playlist automaticamente
        Musica musica1 = new Musica("A Ele a Glória", "Fernandinho", 5.02);
        Musica musica2 = new Musica("Faz Chover", "Fernandinho", 4.34);
        Musica musica3 = new Musica("Nosso Deus", "Fernandinho", 4.18);
        Musica musica4 = new Musica("Glória e Honra", "Fernandinho", 4.50);

        // Inserindo as músicas na playlist
        playlist.adicionarMusica(musica1);
        playlist.adicionarMusica(musica2);
        playlist.adicionarMusica(musica3);
        playlist.adicionarMusica(musica4);

        int opcao;

        do {
            System.out.println("\n--- Gerenciador de Playlist de Fernandinho ---");
            System.out.println("1. Adicionar música");
            System.out.println("2. Remover música");
            System.out.println("3. Listar músicas");
            System.out.println("4. Duração total da playlist");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    // Adicionar música interativamente
                    System.out.print("Título da música: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Artista (será 'Fernandinho'): ");
                    String artista = scanner.nextLine();
                    System.out.print("Duração (em minutos): ");
                    double duracao = scanner.nextDouble();
                    scanner.nextLine();  // Limpar o buffer do scanner
                    Musica musica = new Musica(titulo, artista, duracao);
                    playlist.adicionarMusica(musica);
                    System.out.println("Música adicionada com sucesso!");
                    break;

                case 2:
                    // Remover música
                    System.out.print("Digite o título da música para remover: ");
                    String tituloRemover = scanner.nextLine();
                    if (playlist.removerMusica(tituloRemover)) {
                        System.out.println("Música removida com sucesso!");
                    } else {
                        System.out.println("Música não encontrada!");
                    }
                    break;

                case 3:
                    // Listar músicas
                    playlist.listarMusicas();
                    break;

                case 4:
                    // Duração total
                    playlist.exibirDuracaoTotal();
                    break;

                case 5:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
