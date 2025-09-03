import java.util.ArrayList;

public class Playlist {
    private ArrayList<Musica> musicas;

    public Playlist() {
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
        System.out.println("Música adicionada: " + musica.getTitulo());
    }

    public void removerMusica(String titulo) {
        boolean removida = false;
        for (Musica m : musicas) {
            if (m.getTitulo().equalsIgnoreCase(titulo)) {
                musicas.remove(m);
                System.out.println("Música removida: " + m.getTitulo());
                removida = true;
                break;
            }
        }
        if (!removida) {
            System.out.println("Música não encontrada: " + titulo);
        }
    }

    public void listarMusicas() {
        if (musicas.isEmpty()) {
            System.out.println("Playlist vazia!");
        } else {
            System.out.println("Lista de músicas:");
            for (Musica m : musicas) {
                System.out.println(m);
            }
        }
    }

    public double duracaoTotal() {
        double total = 0;
        for (Musica m : musicas) {
            total += m.getDuracao();
        }
        return total;
    }
}
