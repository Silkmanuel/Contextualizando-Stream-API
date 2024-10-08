package FunctionalInterface.SupplierExemplo;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

// Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
// É comumente usado«a para criar ou fornecer novos objectos de um determinado tipo

public class ExemploSupplier {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo.";

        // Usar o Supplier para obter uma lista com 5 saudações.
        List<String> listaSaudacoes = Stream.generate(saudacao).limit(4).toList();
        // Imprimir as saudacoes geradas
        listaSaudacoes.forEach(System.out::println);
    }
    
}
