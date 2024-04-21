package br.com.lucas.filmebao.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComRequisicao {
   public static void main(String[] args) throws IOException, InterruptedException {
    
       var leitura = new Scanner(System.in);

       System.out.println("Digite o nome do filme que está buscando: ");
       String busca = leitura.nextLine();
   
       String apiKey = "85adf8ba";

       var endereco = String.format("http://www.omdbapi.com/?t=%s&apikey=%s", busca, apiKey);
   
       HttpClient client = HttpClient.newHttpClient();
       
       HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();
       HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

       System.out.println(response.body());

   }
}
