package edu.dio.functionalInterface.desafioStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.OptionalDouble;
import java.util.Optional;
import java.util.Comparator;

public class Desafios {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Desafio 1
        List<Integer> numerosOrdenados = numeros.stream()
            .sorted()
            .collect(Collectors.toList());

        numerosOrdenados.forEach(System.out::println);

        //Desafio 2
        int somaNumerosPares = numeros.stream()
            .filter(n -> n % 2 == 0)
            .mapToInt(Integer::intValue)
            .sum();

        System.out.println(somaNumerosPares);

        //Desafio 3
        boolean saoTodosPositivos = numeros.stream()
            .allMatch(n -> n > 0);
            
        System.out.println(saoTodosPositivos);

        //Desafio 4
        numeros.stream()
            .filter(n -> n % 2 != 0)
            .forEach(System.out::println);
            
        //Desafio 5
        OptionalDouble mediaMaiores5 = numeros.stream()
            .filter(n -> n > 5)
            .mapToInt(Integer::intValue)
            .average();

        System.out.println(mediaMaiores5);

        //Desafio 6
        boolean maiorQue10 = numeros.stream()
            .anyMatch(n -> n > 10);

        System.out.println(maiorQue10);

        //Desafio 7
        Optional<Integer> segundoMaior = numeros.stream()
            .distinct() // Remove duplicados se houver
            .sorted(Comparator.reverseOrder()) // Ordena em ordem decrescente
            .skip(1) // Pula o primeiro (maior) número
            .findFirst(); // Encontra o segundo número
        System.out.println(segundoMaior);

        //Desafio 8
        int somaNumeros = numeros.stream()
            .mapToInt(Integer::intValue)
            .sum();

        System.out.println(somaNumeros);

        //Desafio 9
        boolean saoTodosDiferentes = numeros.stream()
            .distinct()
            .count() == numeros.size();
            
        System.out.println(saoTodosDiferentes);

        //Desafio 10 
        List<Integer> grupoImpares = numeros.stream()
            .filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0))
            .collect(Collectors.toList());

        System.out.println(grupoImpares);

        //Desafio 11
        int somaDosQuadrados = numeros.stream()
            .mapToInt(n -> n * n)
            .sum();

        System.out.println(somaDosQuadrados);

        //Desafio 12
        int produto = numeros.stream()
            .reduce(1, (a, b) -> a * b);

        System.out.println(produto);

        //Desafio 13
        List<Integer> intervalo = numeros.stream()
            .filter(n -> n > 5 && n < 9)
            .collect(Collectors.toList());

        System.out.println(intervalo);

        //Desafio 14
        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(n -> {
                    if (n < 2)
                        return false;
                    for (int i = 2; i <= Math.sqrt(n); i++) {
                        if (n % i == 0)
                            return false;
                    }
                    return true;
                })
                .max(Comparator.naturalOrder());
        System.out.println(maiorPrimo);    

        //Desafio 15
        boolean negativo = numeros.stream()
            .anyMatch(n -> n < 0);

        System.out.println(negativo);   

        //Desafio 16
        List<Integer> pares = numeros.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());

        System.out.println(pares);

        List<Integer> impares = numeros.stream()
            .filter(n -> n % 2 != 0)
            .collect(Collectors.toList());
        System.out.println(impares);

        //Resposta GPT
        Map<Boolean, List<Integer>> groupedByParity = numeros.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Números pares: " + groupedByParity.get(true));
        System.out.println("Números ímpares: " + groupedByParity.get(false));

        //Desafio 17
        List<Integer> primos = numeros.stream()
                .filter(n -> {
                    if (n < 2)
                        return false;
                    for (int i = 2; i <= Math.sqrt(n); i++) {
                        if (n % i == 0)
                            return false;
                    }
                    return true;
                })
                .collect(Collectors.toList());
        System.out.println(primos);    

        //Desafio 18
        boolean saoTodosIguais = numeros.stream()
            .distinct()
            .count() == 1;
            
        System.out.println(saoTodosIguais);

        //Desafio 19
        int somaMultde3E5 = numeros.stream()
            .filter(n -> n % 3 == 0 && n % 5 == 0)
            .mapToInt(Integer::intValue)
            .sum();

        System.out.println(somaMultde3E5);     

    }    
}
