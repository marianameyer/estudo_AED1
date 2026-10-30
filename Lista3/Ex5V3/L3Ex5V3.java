import java.util.*;

public class L3Ex5V3 {

    public static void main(String[] args) {

        System.out.println("=== Lista 3 - Exercício 5 ===\n");

        // Variáveis
        int tam = 10;

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

        // Retirando os elementos da fila e preenchendo a pilha 
        while(!Fila.vazia()) {
          String aux = Fila.desinfileira();
          Pilha.empilha(aux);
        }

        // Saída da pilha
        System.out.println("\nPilha:");
        Pilha.imprime();
        System.out.println("\n===============");

        // Retirando os elementos da pilha e preenchendo a fila 
        while(!Pilha.vazia()) {
          String aux = Pilha.desempilha();
          Fila.enfileira(aux);
        }

        // Saída da fila invertida
        System.out.println("\nFila invertida:");
        Fila.imprime();
        System.out.println("\n===============");
    }
}
