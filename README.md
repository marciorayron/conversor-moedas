# O conversor de moedas

Este é um programa básico em Java que realiza conversões entre diferentes moedas. Ele utiliza a API do Exchange Rate API para obter as taxas de câmbio mais recentes.

### Observações
Este programa foi desenvolvido como parte do desafio da Alura, dentro do programa Oracle Next Education.

### Funcionalidades
- Conversão de Real para Dólar 
- Conversão de Dólar para Real
- Conversão de Dólar para Peso Argentino
- Conversão de Dólar para Peso Chileno
- Conversão de Dólar para Peso Colombiano
- Conversão de Dólar para Boliviano

### Dependências
Gson - Utilizada para análise JSON. 

## Como usar
 ### Configuração do ambiente:

 - Certifique-se de ter o JDK (Java Development Kit) instalado em seu sistema. Você pode baixá-lo e instalá-lo a partir do site oficial da Oracle ou de outras fontes confiáveis.
 - Clone este repositório em seu computador.


 ### Compilação do código:
 - No terminal, navegue até o diretório onde você clonou o repositório.
 - Compile os arquivos .java utilizando o comando javac, incluindo o arquivo gson-2.8.8.jar necessário para utilizar a biblioteca Gson para análise JSON. 
```bash

javac -cp ".:../../resources/gson-2.8.8.jar" *.java
```

Certifique-se de ter o arquivo gson-2.8.8.jar na raiz do projeto. Este arquivo é necessário para utilizar a biblioteca Gson para análise JSON.


 ### Execução do programa:
 - Após a compilação bem-sucedida, execute o programa principal com o seguinte comando:
```bash
java -cp ".:../../resources/gson-2.8.8.jar" Principal
```
Siga as instruções exibidas no terminal para realizar as conversões desejadas.
