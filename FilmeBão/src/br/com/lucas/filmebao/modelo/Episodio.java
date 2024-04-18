package br.com.lucas.filmebao.modelo;

import br.com.lucas.filmebao.calculos.Classificavel;

public class Episodio implements Classificavel{
    private int numeroDeEpisodios;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroDoEpisodio(int numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public Serie getSerie() {
        return serie;
    }

    @Override
    public int getCassificacoes() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }

    }
}
