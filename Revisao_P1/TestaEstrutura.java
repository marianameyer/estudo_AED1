import java.util.*;

public class TestaEstrutura {

    public static void main(String[] args) {

      System.out.println("=== Testando as Estruturas ===\n      Lista, Fila e Pilha\n");

      // Definindo um tamanho fixo para nossas estruturas 
      int tamanho = 4;

      /*// Lista
      // Criando e populando fila 
      Lista.fazListaVazia(tamanho);
      Lista.insere("a");
      Lista.insere("b");
      Lista.insere("c");
      Lista.insere("d");
      Lista.insere("e");
      System.out.println("\nLista original:");
      Lista.imprimeLista();
      System.out.println("\n===============\n");
      //Lista.insere("f");
      //Lista.insere("g");
      Lista.retira("b");
      System.out.println("Lista alterada:");
      Lista.imprimeLista();
      System.out.println("\n===============\n");*/

      /*// Pilha 
      // Criando e populando a pilha 
      Pilha.fazPilhaVazia(tamanho);
      Pilha.empilha("a");
      Pilha.empilha("b");
      Pilha.empilha("c");
      Pilha.empilha("d");
      Pilha.empilha("e");
      Pilha.empilha("f");
      System.out.println("=================");
      System.out.println("Pilha original:");
      Pilha.imprime();
      System.out.println("=================\n");
      Pilha.desempilha();
      Pilha.desempilha();
      System.out.println("=================");
      System.out.println("Pilha alterada:");
      Pilha.imprime();
      System.out.println("=================\n");*/

      // Fila 
      // Criando e populando a fila 
      Fila.fazFilaVazia(tamanho);
      Fila.enfileira("a");
      Fila.enfileira("b");
      Fila.enfileira("c");
      //Fila.enfileira("d");
      System.out.println("=================\n");
      System.out.println("Fila original:");
      Fila.imprime();
      System.out.println("\n=================\n");
      Fila.desenfileira();
      System.out.println("Fila alterada:");
      Fila.imprime();
      System.out.println("\n=================\n");
      
    }
}
