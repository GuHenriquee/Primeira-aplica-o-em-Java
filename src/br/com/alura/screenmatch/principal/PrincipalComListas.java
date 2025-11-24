package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {

    public static void main(String[] args){
        Filme meuFilme = new Filme("Poderoso BILL", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(7);
        var filmeGu = new Filme("junior", 2010);
        filmeGu.avalia(8);
        Serie lost = new Serie("Lost", 2000);

        var f1 = filmeGu;


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeGu);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        Collections.sort(lista);
        System.out.println("Lista de Titulos ordenados: " + lista);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            System.out.println(item.getDuracaoEmMinutos());
            if (item instanceof Filme filme){
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

        List<String> buscarArtista = new ArrayList<>();

        buscarArtista.add("Adam Sandler");
        buscarArtista.add("Paulo");
        buscarArtista.add("Junior");

        System.out.println(buscarArtista);

        Collections.sort(buscarArtista);

        System.out.println("Depois da ordenação: " + buscarArtista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println("Lista de Titulos ordenados por ano: " + lista);




        }



    }


