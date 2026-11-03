// Lista de Exercícios: Estruturas Básicas
// Exercício 1

import java.util.*;

public class LEBEx1 {

    public static void main(String[] args) {

      System.out.println("=== Lista de Exercícios: Estruturas Básicas ===");
      System.out.println("\nExercício 1:");

      // a)  Inserção dos elementos {1, 2, 4, 6, 7, -9, 0, 22} à lista.
      Lista lista1 = new Lista(20);
      lista1.insere(1);
      lista1.insere(2);
      lista1.insere(4);
      lista1.insere(6);
      lista1.insere(7);
      lista1.insere(-9);
      lista1.insere(0);
      lista1.insere(22);

      // b) Impressão dos elementos da lista.
      System.out.println("\n================");
      System.out.println("Lista inicial:");
      lista1.imprime();
      System.out.println("================\n");

      // c) Retirada dos elementos {3, 4, 5} da lista.
      lista1.retira(3);
      lista1.retira(4);
      lista1.retira(5);
      System.out.println("\n================");
      System.out.println("Lista alterada:");
      lista1.imprime();
      System.out.println("================\n");

      // d) Complete o conjunto de métodos da classe, inserindo:
      // i) o método: public Object first() para retornar, sem retirar, o primeiro 
      // elemento da lista.
      // ii) o método: public Object next() para retornar, sem retirar, o próximo 
      // elemento da lista.
      System.out.println("O primeiro elemento da lista é: " + lista1.first());
      System.out.println("O próximo elemento da lista é: " + lista1.next());
      System.out.println("O próximo elemento da lista é: " + lista1.next());

      // e) Retirada do primeiro elemento da lista.
      lista1.retira(lista1.first());
      System.out.println("\n================");
      System.out.println("Lista alterada 2:");
      lista1.imprime();
      System.out.println("================\n");

      // f) Pesquisa dos elementos {22, -7}.
      lista1.pesquisa(22);
      lista1.pesquisa(-7);

      // g) Imprima os elementos da lista.
      System.out.println("\n================");
      System.out.println("Lista final:");
      lista1.imprime();
      System.out.println("================\n");
    }
}