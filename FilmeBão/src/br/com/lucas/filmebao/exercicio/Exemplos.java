package br.com.lucas.filmebao.exercicio;
import java.lang.reflect.Array;
import java.util.ArrayList;

import br.com.lucas.filmebao.exercicio.exemplo.PessoaModelo;
import br.com.lucas.filmebao.exercicio.exemplo.Produto;
import br.com.lucas.filmebao.exercicio.exemplo.ProdutoPerecivel;

public class Exemplos {
    public static void main(String[] args) {
        // PessoaModelo pessoa1 = new PessoaModelo();
        // pessoa1.setNome("Lucas");
        // pessoa1.setIdade(23);

        // PessoaModelo pessoa2 = new PessoaModelo();
        // pessoa2.setNome("Geovana");
        // pessoa2.setIdade(24);

        // PessoaModelo pessoa3 = new PessoaModelo();
        // pessoa3.setNome("Eduardo");
        // pessoa3.setIdade(10);

        // ArrayList<PessoaModelo> listaDePessoas = new ArrayList<>();
        // listaDePessoas.add(pessoa3);
        // listaDePessoas.add(pessoa2);
        // listaDePessoas.add(pessoa1);

        // System.out.println(listaDePessoas.size());
        // System.out.println(listaDePessoas.get(0));
        // System.out.println(listaDePessoas);
        // System.out.println("Lista de Pessoas:");
        // for (PessoaModelo pessoa : listaDePessoas) {
        //  System.out.println(pessoa);
        // }

        var produto1 = new Produto("Arroz", 21.80, 100);
        var produto2 = new Produto("Feijão", 4.49, 100);
        var produto3 = new Produto ("Tinta", 45.69, 3);
        var produtoPerecivel = new ProdutoPerecivel("Alface", 3.00, 50, "29/04/2024");
        
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        
        System.out.println(listaDeProdutos.size());
        System.out.println(listaDeProdutos.get(2));

        System.out.println(listaDeProdutos);
        
        System.out.println(produtoPerecivel);
        
    }
}
