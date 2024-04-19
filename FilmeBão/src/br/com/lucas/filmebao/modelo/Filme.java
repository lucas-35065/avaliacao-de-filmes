package br.com.lucas.filmebao.modelo;

import br.com.lucas.filmebao.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

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

    @Override
    public String toString() {
        return String.format("Filme: %s (%d)", getNome(), getAnoDeLancamento());
    }
}