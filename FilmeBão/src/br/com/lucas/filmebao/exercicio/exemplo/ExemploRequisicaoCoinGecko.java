package br.com.lucas.filmebao.exercicio.exemplo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ExemploRequisicaoCoinGecko {
    public static void main(String[] args) throws IOException, InterruptedException {
        @SuppressWarnings("resource")
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escreva o nome da criptomoeda que busca:");
        var busca = leitura.nextLine();

        var apiKey = "CG-qjWukFYdPbq6ygXiNhTVGo9E";
        var endereco = String.format("https://api.coingecko.com/api/v3/exchanges/%s?x_cg_demo_api_key=%s", busca, apiKey);

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .header("accept", "application/json")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


    }
}
