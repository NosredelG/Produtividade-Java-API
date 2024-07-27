package edu.dio.functionalInterface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
    
        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        int resultado = numeros.stream()
            .reduce(0, somar);

        BinaryOperator<Integer> multiplicar = (num1, num2) -> num1 * num2;
        int fatorial = numeros.stream()
            .reduce(1, multiplicar);
    
        // Usar o BinaryOperator para somar todos os números no Stream
        int resultado2 = numeros.stream()
            .reduce(0, Integer::sum);
    
        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado);

        System.out.println("A soma2 dos números é: " + resultado2);

        System.out.println("O fatorial de " +  numeros.size() + " é " + fatorial);
      }
}
