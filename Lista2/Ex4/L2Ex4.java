import java.util.*;

// Lista 2 - Listas Lineares Estáticas

/* 4) Altere de forma adequada a classe Lista (com métodos estáticos), de forma 
que possamos usá-la como lista, fila ou pilha. Dica: pense nas disciplinas de 
pilhas (Last In First Out) e de filas (first in, first out) e na'indisciplina' 
de uma Lista, a partir da qual podemos inserir e retirar elementos de quaisquer 
posições. Pense também em criar versões diferentes do método que 
adiciona/retira elementos para enfileirar/desempilhar.
*/

public class L2Ex4 {

    public static void main(String[] args) {

      System.out.println("=== Lista 2 - Exercício 4 ===\n");

      int tam = 6;

      // Criando a estrutura vazia 
      Lista.fazListaVazia(tam);

      /*// Escolhendo trabalhar com lista 
      Lista.insere("a");
      Lista.insere("b");
      Lista.insere("c");
      System.out.println("\nLista criada:");
      Lista.imprimeLista();
      System.out.println("\n================");
      Lista.retira("b");
      System.out.println("Lista alterada:");
      Lista.imprimeLista();*/

      /*// Escolhendo trabalhar com fila 
      Lista.enfileira("a");
      Lista.enfileira("b");
      Lista.enfileira("c");
      System.out.println("\nFila criada:");
      Lista.imprimeFila();
      System.out.println("\n================");
      Lista.desinfileira();
      System.out.println("Fila alterada:");
      Lista.imprimeFila();*/

      // Escolhendo trabalhar com pilha 
      Lista.empilha("a");
      Lista.empilha("b");
      Lista.empilha("c");
      System.out.println("\nPilha criada:");
      Lista.imprimePilha();
      System.out.println("\n================");
      Lista.desempilha();
      System.out.println("Pilha alterada:");
      Lista.imprimePilha();
      
    }
}
