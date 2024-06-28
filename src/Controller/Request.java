package Controller;

import Model.Currency;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request {
    public static String requesToAPI(String primaryValue, String secondaryValue, double currencyValue){
        final String API_KEY = "055ad13237c1bd1eff4294e2";

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + primaryValue + "/" + secondaryValue + "/" + currencyValue);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            double result = new Gson().fromJson(response.body(), Currency.class).getValorAConvertir();
            return result + "xd";
        }catch (Exception e){
            return "";
        }
    }

}
