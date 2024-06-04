import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConversor {

    public static ApiMoedas buscaCotacao () throws IOException, InterruptedException{
        var apikey = "ac90510ebb993711680502de";
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/"+apikey+"/latest/USD");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            JsonObject jsonObject = new Gson().fromJson(response.body(), JsonObject.class);
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
            double ars = conversionRates.get("ARS").getAsDouble();
            double bob = conversionRates.get("BOB").getAsDouble();
            double brl = conversionRates.get("BRL").getAsDouble();
            double clp = conversionRates.get("CLP").getAsDouble();
            double cop = conversionRates.get("COP").getAsDouble();
            double usd = conversionRates.get("USD").getAsDouble();
            return new ApiMoedas(ars, bob, brl, clp, cop, usd);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter a cotacão.");

        }


    }



}

