package edu.dio.functionalInterface.desafioStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.OptionalDouble;

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
    }    
}
