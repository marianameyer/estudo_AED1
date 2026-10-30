import java.util.*;

// Lista 3 - Listas Lineares Estáticas

/* 5) Considere uma pilha P vazia e uma fila F não vazia. Utilizando apenas os testes de 
fila e pilha vazias, as operações Enfileira, Desenfileira, Empilha, Desempilha, e uma 
variável aux do tipo Object, escreva uma função que inverta a ordem dos elementos da fila.
*/

public class L3Ex5 {

    public static void main(String[] args) {

      System.out.println("=== Lista 3 - Exercício 5 ===\n");

      // Variáveis
      int tam = 5;

      // Criação da pilha e da fila (populada - não vazia)
      Pilha.fazPilhaVazia(tam);
      Fila.fazFilaVazia(tam);
      Fila.enfileira("a");
      Fila.enfileira("b");
      Fila.enfileira("c");
      Fila.enfileira("d");
      System.out.println("\n==============");
      System.out.println("\nFila original:");
      Fila.imprime();
      System.out.println("\n==============");

      // Populando a pilha com os dados da fila 
      for(int i = 0; i < tam-1; i++){
        String aux = Fila.desinfileira();
        Pilha.empilha(aux);
      }
      System.out.println("\nPilha:");
      Pilha.imprime();
      System.out.println("\n==============");

      // Populando a fila - Fila invertida 
      for(int i = tam-1; i > 0; i--){
        String aux = Pilha.desempilha();
        Fila.enfileira(aux);
      }
      System.out.println("\nFila invertida:");
      Fila.imprime();
      System.out.println("\n==============");
    }
}
