import java.util.ArrayList;

public class Playlist {
    private ArrayList<Musica> playlist;

    // Construtor
    public Playlist() {
        this.playlist = new ArrayList<>();
    }

    // Adicionar música
    public void adicionarMusica(Musica musica) {
        playlist.add(musica);
    }

    // Remover música pelo título
    public boolean removerMusica(String titulo) {
        for (Musica musica : playlist) {
            if (musica.getTitulo().equalsIgnoreCase(titulo)) {
                playlist.remove(musica);
                return true;
            }
        }
        return false;
    }

    // Listar todas as músicas
    public void listarMusicas() {
        if (playlist.isEmpty()) {
            System.out.println("A playlist está vazia!");
        } else {
            for (Musica musica : playlist) {
                System.out.println(musica);
            }
        }
    }

    // Exibir duração total da playlist
    public void exibirDuracaoTotal() {
        double duracaoTotal = 0;
        for (Musica musica : playlist) {
            duracaoTotal += musica.getDuracao();
        }
        System.out.println("Duração total da playlist: " + duracaoTotal + " minutos.");
    }
}
