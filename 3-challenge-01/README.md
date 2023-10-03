# Desafio 03 da Trilha Java Básico da DIO

## Enunciado

Vamos exercitar todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

* Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: `"Imprimindo o número 1"`, `"Imprimindo o número 2"` e assim por diante.
* Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de `ParametrosInvalidosException` com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"   

## Solução por Marcos Oliveira

InvalidParametersException.java
```java
public class InvalidParametersException extends Exception {
    public InvalidParametersException(String message) {
        super(message);
    }
}
``` 


NumberCounter .java

```java
import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the first parameter:");
        int parameterOne = inputScanner.nextInt();
        System.out.println("Enter the second parameter:");
        int parameterTwo = inputScanner.nextInt();

        try {
            // Calling the method containing the counting logic
            countNumbers(parameterOne, parameterTwo);

        } catch (InvalidParametersException exception) {
            System.out.println(exception.getMessage());
        } finally {
            // Close the Scanner to prevent resource leakage
            inputScanner.close();
        }
    }

    static void countNumbers(int parameterOne, int parameterTwo) throws InvalidParametersException {
        // Validate if parameterOne is GREATER than parameterTwo and throw the exception
        if (parameterOne > parameterTwo) {
            throw new InvalidParametersException("The second parameter must be greater than the first.");
        }

        int count = parameterTwo - parameterOne;
        // Perform the loop to print numbers based on the 'count' variable
        for (int i = 1; i <= count; i++) {
            System.out.println("Printing number " + i);
        }
    }
}
```
