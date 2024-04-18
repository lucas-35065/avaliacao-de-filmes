package br.com.lucas.filmebao.modelo;

import br.com.lucas.filmebao.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public int getCassificacoes() {
        return (int) calculaMedia()/2;
    }
}