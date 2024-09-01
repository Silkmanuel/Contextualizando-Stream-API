package FunctionalInterface.ConsumerExemplo;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
// Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
// = É utilizada proincipalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modifcar, ou retornar valor

class ExemploConsumer {
    public static void main(String[] args) {
        //Criar uma lista de número inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);


        // Usar Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimir = numero -> {
            if (numero % 2 == 0) System.out.print(numero + " ");  
        };


        // Usar o Consumer para imprimir números pares no Stream
        numeros.stream().forEach(imprimir);
    }
    
}