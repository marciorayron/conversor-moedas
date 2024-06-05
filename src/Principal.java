import java.util.Scanner;
import java.util.function.DoubleFunction;

public class Principal {
    private static final Scanner leitura = new Scanner(System.in);

    public static void main(String[] args) {
        ConversorDeMoedas conversor = new ConversorDeMoedas();
        apresentarMenu();
        int opcao = leitura.nextInt();

        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    realizarConversao("Real", "Dólar", conversor::RealParaDolar);
                    break;
                case 2:
                    realizarConversao("Dólar","Real", conversor::DolarParaReal);
                    break;
                case 3:
                    realizarConversao("Peso Argentino","Dólar",conversor::PesoArgentinoParaDolar);
                    break;
                case 4:
                    realizarConversao("Dólar","Peso Argentino",conversor::DolarParaPesoArgentino);
                    break;
                case 5:
                    realizarConversao("Peso Chileno","Dólar",conversor::PesoChilenoParaDolar);
                    break;
                case 6:
                    realizarConversao("Dólar","Peso Chileno",conversor::DolarParaPesoChileno);
                    break;
                case 7:
                    realizarConversao("Peso Colombiano","Dólar",conversor::PesoColombianoParaDolar);
                    break;
                case 8:
                    realizarConversao("Dólar","Peso Colombiano",conversor::DolarParaPesoColombiano);
                    break;
                case 9:
                    realizarConversao("Boliviano","Dólar",conversor::BolivianoParaDolar);
                    break;
                case 10:
                    realizarConversao("Dólar","Boliviano",conversor::DolarParaBoliviano);
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
                        "3) Peso Argentino --> Dólar\n"+
                        "4) Dólar --> Peso Argentino\n" +
                        "5) Peso Chileno --> Dólar\n"+
                        "6) Dólar --> Peso Chileno\n" +
                        "7) Peso Colombiano --> Dólar\n"+
                        "8) Dólar --> Peso Colombiano\n" +
                        "9) Boliviano --> Dólar\n"+
                        "10) Dólar --> Boliviano\n" +
                        "0) Sair\n" +
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
