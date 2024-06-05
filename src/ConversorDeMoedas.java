import java.io.IOException;

public class ConversorDeMoedas {
    private final Moedas moedas;

    public ConversorDeMoedas() {
        try {
            this.moedas = new Moedas(ApiConversor.buscaCotacao());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Falha ao buscar cotação das moedas: " + e.getMessage());
        }
    }

    public double RealParaDolar(double valorInput) {
        return (moedas.getDolarAmericano() / moedas.getReal()) * valorInput;
    }

    public double DolarParaReal(double valorInput) {
        return valorInput * moedas.getReal();
    }

    public double PesoArgentinoParaDolar(double valorInput) {
        return (moedas.getDolarAmericano() / moedas.getPesoArgentino()) * valorInput;
    }

    public double DolarParaPesoArgentino(double valorInput) {
        return valorInput * moedas.getPesoArgentino();
    }

    public double PesoChilenoParaDolar(double valorInput) {
        return (moedas.getDolarAmericano() / moedas.getPesoChileno()) * valorInput;
    }

    public double DolarParaPesoChileno(double valorInput) {
        return valorInput * moedas.getPesoChileno();
    }

    public double PesoColombianoParaDolar(double valorInput) {
        return (moedas.getDolarAmericano() / moedas.getPesoColombiano()) * valorInput;
    }

    public double DolarParaPesoColombiano(double valorInput) {
        return valorInput * moedas.getPesoColombiano();
    }

    public double BolivianoParaDolar(double valorInput) {
        return (moedas.getDolarAmericano() / moedas.getBoliviano()) * valorInput;
    }

    public double DolarParaBoliviano(double valorInput) {
        return valorInput * moedas.getBoliviano();
    }

}


