package modelos;

public class Podcast  extends Audio {



    int numeroDeEpisodios;
    int temporadas;


    public void exibeFichaTecnicaPodcast() {
        System.out.println("Autor: " + autor);
        System.out.println("Número de Episódios: " + numeroDeEpisodios);
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }



    public int getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public void setNumeroDeEpisodios(int numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }


    public Podcast(String autor, int anoDeLancamento, String faixa) {
        super(autor, anoDeLancamento, faixa);

    }

}


