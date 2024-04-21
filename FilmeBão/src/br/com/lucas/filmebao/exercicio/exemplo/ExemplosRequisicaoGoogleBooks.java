package br.com.lucas.filmebao.exercicio.exemplo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ExemplosRequisicaoGoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        var leitura = new Scanner(System.in);
        System.out.println("Escreva o nome do livro que busca:");
        var nomeLivro = leitura.nextLine();
        System.out.println("Escreva o nome do autor:");
        var nomeAutor = leitura.nextLine();

        var key = "AIzaSyAz0SH6xXLvLCrplCMsMmvd01I3VNSxlMc";

        var endereco = String.format("https://www.googleapis.com/books/v1/volumes?q=%s+inauthor:%s&key=%s", 
            nomeLivro, nomeAutor, key);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create(endereco))
              .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); 
    
        System.out.println(response.body());
    }
}
