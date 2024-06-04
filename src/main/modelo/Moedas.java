package main.modelo;

import main.api.ApiMoedas;

public class Moedas {
    private double pesoArgentino;
    private double boliviano;
    private double real;
    private double pesoChileno;
    private double pesoColombiano;
    private double dolarAmericano;

    public Moedas(double ars, double bob, double brl, double clp, double cop, double usd) {
        this.pesoArgentino = ars; //ARS - Peso argentino
        this.boliviano = bob; //BOB - Boliviano boliviano
        this.real = brl; //BRL - Real brasileiro
        this.pesoChileno = clp; //CLP - Peso chileno
        this.pesoColombiano = cop; //COP - Peso colombiano
        this.dolarAmericano = usd; //USD - Dólar americano
    }

    public Moedas(ApiMoedas apiMoedas) {
        this.pesoArgentino = apiMoedas.ARS() ;
        this.boliviano = apiMoedas.BOB();
        this.real = apiMoedas.BRL();
        this.pesoChileno = apiMoedas.CLP();
        this.pesoColombiano = apiMoedas.COP();
        this.dolarAmericano = apiMoedas.USD();
    }


    public double getPesoArgentino() {
        return pesoArgentino;
    }

    public double getBoliviano() {
        return boliviano;
    }

    public double getReal() {
        return real;
    }

    public double getPesoChileno() {
        return pesoChileno;
    }

    public double getPesoColombiano() {
        return pesoColombiano;
    }

    public double getDolarAmericano() {
        return dolarAmericano;
    }

    @Override
    public String toString() {
        return "Moedas{" +
                "pesoArgentino=" + pesoArgentino +
                ", bolivares=" + boliviano +
                ", real=" + real +
                ", pesoChileno=" + pesoChileno +
                ", pesoColombiano=" + pesoColombiano +
                ", dolarAmericano=" + dolarAmericano +
                '}';
    }
}

