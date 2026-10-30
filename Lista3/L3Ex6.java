import java.util.*;

// Lista 3 - Listas Lineares Estáticas

/* 6) Considere a implementação de filas usando arranjos “circulares”. Escreva um método
public boolean FuraFila(Object item) que insere um item na primeira posição da fila. O 
detalhe é que seu procedimento deve ser O(1), ou seja, não pode movimentar os outros itens 
da fila. (Observe que este neste caso, estaremos desrepeitando o conceito de FILA – 
primeiro a entrar é o primeiro a sair).
*/

public class L3Ex6 {

    public static void main(String[] args) {

      System.out.println("=== Lista 3 - Exercício 6 ===\n");

      // Definindo o tamanho 
      int tam = 5;

      // Criando a fila
      Fila.fazFilaVazia(tam);
      Fila.enfileira("a");
      Fila.enfileira("b");
      //Fila.enfileira("c");
      //Fila.enfileira("d");

      // Saída da fila original
      System.out.println("\n===============");
      System.out.println("Fila original:\n");
      Fila.imprime();
      
      // Testando o método furaFila 
      Fila.FuraFila("X");

      // Saída da fila resultante
      System.out.println("\n===============");
      System.out.println("Fila \"furada\":\n");
      Fila.imprime();
      System.out.println("\n===============");

    }
}