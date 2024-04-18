import br.com.lucas.filmebao.calculos.CalculadoraDeTempo;
import br.com.lucas.filmebao.modelo.Filme;
import br.com.lucas.filmebao.modelo.Serie;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O Hobbit");
        meuFilme.setAnoDeLancamento(2014); 
        meuFilme.setDuracaoEmMinutos(270);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5.5);
        meuFilme.avalia(7);
        meuFilme.avalia(10);

        System.out.println(meuFilme.calculaMedia());

        System.out.println(String.format( "Total de avaliações: %d", meuFilme.getTotalDeAvaliacoes()));

        System.out.println("Duração do filme em horas " + meuFilme.getDuracaoEmHoras());

        Serie demolidor = new Serie();

        demolidor.setNome("O Demolidor");
        demolidor.setEpisodiosPorTemporada(15);
        demolidor.setTemporadas(5);
        demolidor.setMinutosPorEpisodio(55);

        System.out.println(String.format("A duração de Demolidor em minutos é %d", demolidor.getDuracaoEmMinutos()));
        System.out.println(String.format("A duração de Demolidor em horas é %.1f", demolidor.getDuracaoEmHoras()));

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(demolidor);
        calculadora.inclui(meuFilme);

        System.out.println(calculadora.getTempoTotal());
    }
}