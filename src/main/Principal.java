package main;

import main.conversor.ConversorDeMoedas;

import java.util.Scanner;
import java.util.function.DoubleFunction;

public class Principal {
    private static final Scanner leitura = new Scanner(System.in);

    public static void main(String[] args) {
        ConversorDeMoedas conversor = new ConversorDeMoedas();
        apresentarMenu();
        int opcao = leitura.nextInt();

        while (opcao != 8) {
            switch (opcao) {
                case 1:
                    realizarConversao("Real", "Dólar", conversor::converterRealParaDolar);
                    break;
                case 2:
                    realizarConversao("Dólar","Real", conversor::converterDolarParaReal);
                    break;

                case 3:
                    realizarConversao("Dólar","Peso Argentino",conversor::converterDolarParaPesoArgentino);
                    break;
                case 4:
                    realizarConversao("Dólar","Peso Chileno",conversor::converterDolarParaPesoChileno);
                    break;
                case 5:
                    realizarConversao("Dólar","Peso Colombiano",conversor::converterDolarParaPesoColombiano);
                    break;
                case 6:
                    realizarConversao("Dólar","Boliviano",conversor::converterDolarParaBoliviano);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            apresentarMenu();
            opcao = leitura.nextInt();
        }

        System.out.println("Saindo...");
        leitura.close();
    }

    private static void apresentarMenu() {
        System.out.println(
                "\n***************************************\n" +
                        "Seja bem-vindo/a ao Conversor de Moeda: \n\n" +
                        "1) Real  --> Dólar\n" +
                        "2) Dólar --> Real\n" +
                        "3) Dólar --> Peso Argentino\n" +
                        "4) Dólar --> Peso Chileno\n" +
                        "5) Dólar --> Peso Colombiano\n" +
                        "6) Dólar --> Boliviano\n" +
                        "7) Sair\n" +
                        "***************************************\n" +
                        "Escolha uma opção válida:");
    }

    private static void realizarConversao(String moedaOrigem, String moedaDestino, DoubleFunction<Double> funcaoConversao) {
        System.out.println("Digite o valor:");
        double valorInput = leitura.nextDouble();
        double resultado = funcaoConversao.apply(valorInput);
        System.out.printf("Resultado: %.2f (%s) equivale a %.2f (%s)\n", valorInput, moedaOrigem, resultado, moedaDestino);
    }

}
