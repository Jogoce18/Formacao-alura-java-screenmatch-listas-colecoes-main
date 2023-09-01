package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.*;


import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(10);

        Filme outro = new Filme("John Wick", 2014);
        outro.avalia(9);

        Serie serie = new Serie("La Casa de Papel", 2017);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);

        for(Titulo item : lista) {
            System.out.println("Nome: " + item.getNome());
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jack sparrow");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da orenaçao");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
