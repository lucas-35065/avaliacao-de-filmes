package br.com.lucas.filmebao.principal;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.lucas.filmebao.excecao.ErroDeConversaoDeAnoException;
import br.com.lucas.filmebao.modelo.Titulo;
import br.com.lucas.filmebao.modelo.TituloOmdb;

public class PrincipalComRequisicao {
   public static void main(String[] args) throws IOException, InterruptedException {
       try {
            var leitura = new Scanner(System.in);
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();


            System.out.println("Digite o nome do filme que está buscando: ");
            String busca = leitura.nextLine();
        
            String apiKey = "85adf8ba";

            var endereco = String.format("http://www.omdbapi.com/?t=%s&apikey=%s", busca.replace(" ", "+"), apiKey);
        
            HttpClient client = HttpClient.newHttpClient();
            
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            
            var json = response.body();

            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo convertido");
            System.out.println(meuTitulo);

            FileWriter escrita = new FileWriter("filmes.txt");
            escrita.write(meuTitulo.toString());
            escrita.close();
            
            leitura.close();
       } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
       } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca, verifique o endereço");
       } catch (ErroDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());
       } finally {
        System.out.println("Programa finalizado");
       }

    }
}
