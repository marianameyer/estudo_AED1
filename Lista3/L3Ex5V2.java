import java.util.*;

public class L3Ex5V2 {

    public static void main(String[] args) {

        System.out.println("=== Lista 3 - Exercício 5 ===\n");

        // Variáveis
        int tam = 10;
        String aux;

        // Criando a pilha e a fila
        Pilha.fazPilhaVazia(tam);
        Fila.fazFilaVazia(tam);

        // Populando a fila 
        Fila.enfileira("a");
        Fila.enfileira("b");
        Fila.enfileira("c");
        Fila.enfileira("d");

        // Saída da fila original 
        System.out.println("\nFila original:");
        Fila.imprime();
        System.out.println("\n===============");

        // Verificando se não há elemento null e preenchendo a pilha
        aux = Fila.desinfileira();  
        while (aux != null) {
          Pilha.empilha(aux);
          aux = Fila.desinfileira();
        }

        // Saída da pilha
        System.out.println("\nPilha:");
        Pilha.imprime();
        System.out.println("\n===============");

        // Verificando se não há elemento null e preenchendo a fila 
        aux = Pilha.desempilha();
        while (aux != null) {
          Fila.enfileira(aux);
          aux = Pilha.desempilha();
        }

        // Saída da fila invertida
        System.out.println("\nFila invertida:");
        Fila.imprime();
        System.out.println("\n===============");
    }
}