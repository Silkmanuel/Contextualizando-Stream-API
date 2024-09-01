package FunctionalInterface.Function;

import java.util.Arrays;
import java.util.List;

// Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
// É utilizada para transformar ou mapear os elementos do stream em todos outros valores ou tipos 
public class ExemploFunction {
    public static void main(String[] args) {
        // Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        // Usar Função para dobrar todos os números no Stream e armazená-los em outra lista.
        List<Integer> numerosDobrados = numeros.stream().map(n-> n * 2).toList();

        // Imprimir a lista de números dobrados
        numerosDobrados.forEach(System.out::println);
        
    }
}
