package br.com.lucas.filmebao.exercicio.exemplo;

public class PessoaModelo {
    private String nome;
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s; Idade: %d", getNome(), getIdade());
    }
}
