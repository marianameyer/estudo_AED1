// Lista de Exercícios: Estruturas Básicas
// Exercício 3

import java.util.*;

public class LEBEx3 {

    public static void main(String[] args) {

      System.out.println("=== Lista de Exercícios: Estruturas Básicas ===");
      System.out.println("\nExercício 3:");

      // a) Criação da lista de números reais {9.8, 7.7, 6.2, 4.10}
      Lista lista3 = new Lista(4);
      lista3.insere(9.8);
      lista3.insere(7.7);
      lista3.insere(6.2);
      lista3.insere(4.10);

      // b) Impressão dos elementos da lista
      System.out.println("\n================");
      System.out.println("Lista inicial:");
      lista3.imprime();
      System.out.println("================\n");

      // c) Chamada à operação codificada, de acordo com o enunciado, para retirar 
      // desta lista um elemento a partir do segundo elemento.
      lista3.retira(7.7, 2);

      // d) Impressão dos elementos da lista
      System.out.println("\n================");
      System.out.println("Lista alterada:");
      lista3.imprime();
      System.out.println("================\n");

      // e) Chamada à operação codificada para retirar desta lista 3 elementos a 
      // partir do primeiro elemento da lista
      lista3.retira(lista3.first(), 3);

      // f) Impressão dos elementos da lista
      System.out.println("\n================");
      System.out.println("Lista final:");
      lista3.imprime();
      System.out.println("================\n");
    }
}