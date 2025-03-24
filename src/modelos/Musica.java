package modelos;

public class Musica extends Audio {

    String album;
    private int posicaoNaPlaylist;


    public Musica(String autor, int anoDeLancamento, String faixa) {
        super(autor, anoDeLancamento, faixa);

    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void exibeFichaTecnica() {
        System.out.println("Cantor: " + autor);
        System.out.println("Álbum: " + album);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + inicioAudio + " - " + finalAudio);
    }
    public String toString() {
        return "#" + posicaoNaPlaylist + faixa;
    }

    public void setPosicaoNaPlaylist(int posicao) {
        this.posicaoNaPlaylist = posicao;
    }
}
