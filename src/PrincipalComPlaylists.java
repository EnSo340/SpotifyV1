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

        ArrayList<Audio> playlist = new ArrayList<>();
        playlist.add(musica1);
        playlist.add(musica2);
        playlist.add(musica3);

        for (int i = 0; i < playlist.size(); i++) {
            Musica musica = (Musica) playlist.get(i);
            musica.setPosicaoNaPlaylist(i + 1);
        }

        System.out.println("Playlist ordenada:");
        for (Audio item : playlist) {

            for (int i = 0; i < playlist.size(); i++) {
                Musica musica = (Musica) playlist.get(i);
                musica.setPosicaoNaPlaylist(i + 1);

            }
            System.out.println(item.getPosicaoNaPlaylist);
            System.out.println(item.getFaixa());
        }

    }
        }
