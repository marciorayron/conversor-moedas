package src.main.java.conversor;

import src.main.java.modelo.Moedas;
import src.main.java.api.ApiConversor;

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

    public double converterRealParaDolar(double valorInput) {
        return (moedas.getDolarAmericano() / moedas.getReal()) * valorInput;

    }

    public double converterDolarParaReal(double valorInput) {
        return valorInput * moedas.getReal();
    }

    public double converterDolarParaPesoArgentino(double valorInput) {
        return (moedas.getDolarAmericano() / moedas.getPesoArgentino()) * valorInput;
    }

    public double converterDolarParaPesoChileno(double valorInput) {
        return (moedas.getDolarAmericano() / moedas.getPesoChileno()) * valorInput;
    }

    public double converterDolarParaPesoColombiano(double valorInput) {
        return (moedas.getDolarAmericano() / moedas.getPesoColombiano()) * valorInput;
    }

    public double converterDolarParaBoliviano(double valorInput) {
        return (moedas.getDolarAmericano() / moedas.getBoliviano()) * valorInput;
    }

}


