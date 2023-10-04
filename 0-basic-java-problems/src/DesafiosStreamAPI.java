import java.util.*;
import java.util.stream.Collectors;

public class DesafiosStreamAPI {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 1 - Mostrar a lista na ordem numérica
        List<Integer> numerosOrdenados = numeros.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Desafio 1 - Lista ordenada: " + numerosOrdenados);

        // Desafio 2 - Imprimir a soma dos números pares da lista
        int somaNumerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Desafio 2 - Soma dos números pares: " + somaNumerosPares);

        // Desafio 3 - Verificar se todos os números da lista são positivos
        boolean todosPositivos = numeros.stream()
                .allMatch(numero -> numero > 0);
        System.out.println("Desafio 3 - Todos os números são positivos? " + todosPositivos);

        // Desafio 4 - Remover todos os valores ímpares
        List<Integer> numerosSemImpares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Desafio 4 - Lista sem números ímpares: " + numerosSemImpares);

        // Desafio 5 - Calcular a média dos números maiores que 5
        double mediaNumerosMaioresQue5 = numeros.stream()
                .filter(numero -> numero > 5)
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Desafio 5 - Média dos números maiores que 5: " + mediaNumerosMaioresQue5);

        // Desafio 6 - Verificar se a lista contém algum número maior que 10
        boolean contemNumeroMaiorQue10 = numeros.stream()
                .anyMatch(numero -> numero > 10);
        System.out.println("Desafio 6 - Contém número maior que 10? " + contemNumeroMaiorQue10);

        // Desafio 7 - Encontrar o segundo número maior da lista
        Optional<Integer> segundoMaior = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println("Desafio 7 - Segundo número maior: " + segundoMaior.orElse(-1));

        // Desafio 8 - Somar os dígitos de todos os números da lista
        int somaDigitos = numeros.stream()
                .mapToInt(numero -> {
                    int soma = 0;
                    while (numero > 0) {
                        soma += numero % 10;
                        numero /= 10;
                    }
                    return soma;
                })
                .sum();
        System.out.println("Desafio 8 - Soma dos dígitos: " + somaDigitos);
    }
}
