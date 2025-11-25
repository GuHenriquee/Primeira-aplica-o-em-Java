package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class OMDb_API {
    public static void main (String [] arg) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do filme: ");
        var busca = leitura.nextLine();

        String endereco =  "https://www.omdbapi.com/?t=" + busca + "&apikey=7a3c71f9";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


    }
}
