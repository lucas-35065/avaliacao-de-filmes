package br.com.lucas.filmebao.calculos;

public class FiltroRecomendacao {

    public void filtra (Classificavel classificavel){
        if (classificavel.getCassificacoes() >= 4) {
            System.out.println("Essa é a atração do momento!");
        } else if (classificavel.getCassificacoes() >= 2) {
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Favorite aqui para ver mais tarde");
        }
    }
}
