import java.util.*;

// Lista 2 - Listas Lineares Estáticas

/* 3) Escreva um programa para testar a classe Pilha (de métodos estáticos). O programa 
deve exibir o seguinte menu:
  1. Empilhar tarefa
  2. Mostrar a tarefa no topo da pilha (dar uma espiada)
  3. Imprimir pilha de tarefas
  4. Desempilhar uma tarefa
  5. Retornar o número de tarefas na Pilha.
*/

public class L2Ex3 {

    public static void main(String[] args) {

      System.out.println("=== Lista 2 - Exercício 3 ===\n");
      
      // Criação da pilha
      int tam = 5;
      Pilha.fazPilhaVazia(tam);

      // Objeto Scanner
      Scanner sc = new Scanner(System.in);
      int op = 0;

      // Loop do-while
      do{
        System.out.println("\n=== Menu ===\n");
        System.out.println("[1] Empilhar tarefa;\n[2] Mostrar tarefa no topo;");
        System.out.println("[3] Imprimir pilha de tarefas;\n[4] Desempilhar tarefa;");
        System.out.println("[5] Número de tarefas na pilha;\n[6] Sair;");
        System.out.print("Digite sua opção: ");

        op = sc.nextInt();
        sc.nextLine();  // Limpa o buffer do \n 

        // Opções 
        if(op == 1){
          System.out.print("\nInsira a tarefa: ");
          String tarefa = sc.nextLine();
          Pilha.empilha(tarefa);
          System.out.println("Tarefa adicionada!");
        }
        else if(op == 2){
          String tarefa = Pilha.espiar();
          System.out.printf("\nA tarefa \"%s\" está no topo da pilha.\n", tarefa);
        }
        else if(op == 3){
          System.out.println("\nPilha de tarefas:");
          Pilha.imprime();
          System.out.println("");
        }
        else if(op == 4){
          String tarefa = Pilha.desempilha();
          System.out.printf("\nA tarefa \"%s\" foi retirada.\n", tarefa);
        }
        else if(op == 5){
          int num = Pilha.tamanho();
          System.out.printf("\nHá %d tarefa(s) na pilha.\n", num);
        }
        else if(op == 6){
          System.out.println("Programa encerrado.");
        }
        else{
          System.out.println("Opção inexistente! Tente novamente.");
        }
      }
      while(op != 6);

    }
}