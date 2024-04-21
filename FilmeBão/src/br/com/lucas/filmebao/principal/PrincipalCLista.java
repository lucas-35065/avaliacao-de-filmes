package br.com.lucas.filmebao.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.lucas.filmebao.modelo.Filme;
import br.com.lucas.filmebao.modelo.Serie;
import br.com.lucas.filmebao.modelo.Titulo;

public class PrincipalCLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Hobbit", 2014);
        Filme meuFilme2 = new Filme("Harry Potter and The Deatlhy Hallows pt.1", 2012);
        Serie demolidor = new Serie("O Demolidor", 2016);

        meuFilme.avalia(10);
        meuFilme2.avalia(8.5);
        demolidor.avalia(6);

        List<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(demolidor);

        for (Titulo item : lista) {
            System.out.println("Nome: " + item.getNome());
            if (item instanceof Filme filme && filme.getCassificacoes() > 2) {
                System.out.println(String.format("Classificação: %d", filme.getCassificacoes()));                
            }
        }

        // Outro modo de fazer o forEach, este é com lambda
        // lista.forEach(item -> System.out.println(item.getNome()));

        // Essa é uma versão reduzida do exemplo de cima - Method Reference
        // lista.forEach(System.out::println);

        // o casting é feito com o objeto que você quer atribuir em parentesis e depois o nome da variavel, exemplo: 
        // Filme filme = (Filme) item;

        // Usar o List para montar arrays é a forma mais moderna de criar arrays e listas
        List<String> nomes = new ArrayList<>();
        nomes.add("Eduardo");
        nomes.add("Lucas");
        nomes.add("Geovana");

        Collections.sort(nomes);
        System.out.println(nomes);

        // Comparação utilizando o comparable implementado na classe titulo
        Collections.sort(lista);
        System.out.println(lista);

        // Comparação pelo ano de lançamento utilizando qualquer outro atributo de Titulo como comparador
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
