package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setAlbum("Forever");
        minhaMusica.setCantor("Kiss");


        for (int i = 0; i < ; i++) {
            minhaMusica.reprooduz();
        }

        for (int i = 0; i <50;i++) {
            minhaMusica.curte();
        }

        Podcast meuPodscat = new Podcast();
        meuPodscat.setTitulo("BolhaDev");
        meuPodscat.setApresentador("Pedro Jesus");

        for (int i = 0; i < ; i++) {
            meuPodscat.reproduzir();
        }
        for (int i = 0; i < ; i++) {

        }
    }
}