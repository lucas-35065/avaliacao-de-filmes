package br.com.lucas.filmebao.modelo;

public class Episodio {
    private int numeroDeEpisodios;
    private String nome;
    private Serie serie;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroDeEpisodios(int numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
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
}
