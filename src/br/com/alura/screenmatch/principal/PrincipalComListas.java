package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

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

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            System.out.println(item.getDuracaoEmMinutos());
            if (item instanceof Filme filme){
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }
        }

    }


