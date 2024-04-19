import java.util.ArrayList;

import br.com.lucas.filmebao.calculos.CalculadoraDeTempo;
import br.com.lucas.filmebao.calculos.FiltroRecomendacao;
import br.com.lucas.filmebao.modelo.Episodio;
import br.com.lucas.filmebao.modelo.Filme;
import br.com.lucas.filmebao.modelo.Serie;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Hobbit", 2014);
        meuFilme.setDuracaoEmMinutos(270);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5.5);
        meuFilme.avalia(7);
        meuFilme.avalia(10);

        System.out.println(meuFilme.calculaMedia());

        System.out.println(String.format( "Total de avaliações: %d", meuFilme.getTotalDeAvaliacoes()));

        System.out.println("Duração do filme em horas " + meuFilme.getDuracaoEmHoras());

        Serie demolidor = new Serie("O Demolidor", 2016);
        demolidor.setEpisodiosPorTemporada(15);
        demolidor.setTemporadas(5);
        demolidor.setMinutosPorEpisodio(55);

        System.out.println(String.format("A duração de Demolidor em minutos é %d", demolidor.getDuracaoEmMinutos()));
        System.out.println(String.format("A duração de Demolidor em horas é %.1f", demolidor.getDuracaoEmHoras()));

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(demolidor);
        calculadora.inclui(meuFilme);

        System.out.println(calculadora.getTempoTotal());
        
        Episodio episodio1 = new Episodio();
        episodio1.setNome("O Chefão mal");
        episodio1.setNumeroDoEpisodio(10);
        episodio1.setSerie(demolidor);
        episodio1.setTotalVisualizacoes(101);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(episodio1);
        filtro.filtra(meuFilme);
        
        Filme filme2 = new Filme("Harry Potter", 2001);
        filme2.setIncluidoNoPlano(true);
        filme2.setDiretor("Irmãos Russo");
        filme2.avalia(9.8);

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(filme2);
        filmes.add(meuFilme);

        System.out.println("Esse filme é: " + filmes.get(0).getNome());
        System.out.println("Todos os filmes " + filmes);
        System.out.println("toString: " + filmes.toString());
    }

}