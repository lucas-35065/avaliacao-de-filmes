package br.com.lucas.filmebao.exercicio.exemplo;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    

    public Produto(String nome, double preco, int quantidade) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return String.format("""
            
            Produto: %s;
            Preço do item: %.2f;
            Quantidade em estoque: %d;
            """, this.nome, this.preco, this.quantidade);
    }

    
}
