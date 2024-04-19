import java.lang.reflect.Array;
import java.util.ArrayList;

import br.com.lucas.filmebao.exercicio.exemplo.PessoaModelo;

public class Exemplos {
    public static void main(String[] args) {
        PessoaModelo pessoa1 = new PessoaModelo();
        pessoa1.setNome("Lucas");
        pessoa1.setIdade(23);

        PessoaModelo pessoa2 = new PessoaModelo();
        pessoa2.setNome("Geovana");
        pessoa2.setIdade(24);

        PessoaModelo pessoa3 = new PessoaModelo();
        pessoa3.setNome("Eduardo");
        pessoa3.setIdade(10);

        ArrayList<PessoaModelo> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa3);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa1);

        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
        System.out.println(listaDePessoas);
        System.out.println("Lista de Pessoas:");
        for (PessoaModelo pessoa : listaDePessoas) {
         System.out.println(pessoa);
        }

    }
}
