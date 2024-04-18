package br.com.lucas.filmebao.calculos;

import br.com.lucas.filmebao.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui (Titulo t) {
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}
