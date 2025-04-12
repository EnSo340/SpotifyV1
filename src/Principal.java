import modelos.Musica;
import modelos.Podcast;

public class Principal {

    public static void main(String[] args) {


        System.out.println("Recomendações de Musicas para você");
        Musica musica = new Musica("Matue", 2024, "Antes");
        musica.setAlbum("Maquina Do Tempo");
        musica.setInicioAudio("00:00");
        musica.setFinalAudio("3:50");
        musica.exibeFichaTecnica();

        System.out.println("------------------------------------------------------------------------");

        Musica musica1 = new Musica("Imogen Heap", 2005, "HeadLock");
        musica1.setAlbum("Speak for yourself");
        musica1.setInicioAudio("00:00");
        musica1.setFinalAudio("3:50");
        musica1.exibeFichaTecnica();

        System.out.println("------------------------------------------------------------------------");

        System.out.println("Recomendações de Podcasts para você");
        Podcast podcast1 = new Podcast("Flow Podcast", 2025, "425# BRTT");
        podcast1.setTemporadas(10);
        podcast1.setNumeroDeEpisodios(892);
        podcast1.exibeFichaTecnicaPodcast();

        System.out.println("------------------------------------------------------------------------");

        Podcast podcast2 = new Podcast("Podpah", 2025, "892# Fernando Gil");
        podcast2.setTemporadas(10);
        podcast2.setNumeroDeEpisodios(425);
        podcast2.exibeFichaTecnicaPodcast();


    }
}
