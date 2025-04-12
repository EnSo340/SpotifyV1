import modelos.Audio;
import modelos.Musica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrincipalComPlaylists {

    public static void main(String[] args) {

        Musica musica1 = new Musica("Matue", 2024, "Antes");

        Musica musica2 = new Musica("Eve", 2020, "Inochi No Tabetaka");

        Musica musica3 = new Musica("Imogen Heap", 2005, "Headlock");

        Musica musica4 = new Musica("Teto", 2025, "Yes or No");

        ArrayList<Audio> playlist = new ArrayList<>();
        playlist.add(musica1);
        playlist.add(musica2);
        playlist.add(musica3);
        playlist.add(musica4);


        exibirPlaylist(playlist);
    }


        public static void exibirPlaylist (ArrayList < Audio > playlist) {
            System.out.println("Músicas na Playlist: " + playlist.size());
            for (Audio audio : playlist) {
                if (audio instanceof Musica) {
                    Musica musica = (Musica) audio;
                    System.out.println("Título: " + musica.getFaixa() + "\n" + "Cantor: " + musica.getAutor());
                    System.out.println("------------------------------------------------------------------");
                }
            }

        }

    }

