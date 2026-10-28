import java.util.*;

// Lista 2 - Listas Lineares Estáticas

/* 1) Construa um programa Java para gerenciar uma fila de espera usando a 
classe Fila (de métodos estáticos). O programa deve exibir o seguinte menu:
  1. Incluir na lista de espera
  2. Chamar paciente
  3. Imprimir lista de espera
  4. Retornar o número de pacientes em espera

2) Insira na classe Fila, anterior, o método Tamanho() para
retornar o número de elementos da fila.
*/

public class L2Ex1e2 {

    public static void main(String[] args) {

      System.out.println("=== Lista 2 - Exercício 1 ===\n");

      // Criando a fila
      int tam = 10;
      Fila.fazFilaVazia(tam);
      
      // Objeto Scanner
      Scanner sc = new Scanner(System.in);
      int op = 0;

      // Loop do-while para o menu só parar quando quisermos
      do{
        System.out.println("\n=== Menu de Operações ===");
        System.out.println("[1] Incluir na lista de espera;\n[2] Chamar paciente;");
        System.out.println("[3] Imprimir lista de espera;");
        System.out.println("[4] Retornar o número de pacientes em espera;\n[5] Sair;");
        System.out.print("Digite sua opção: ");
        
        op = sc.nextInt();
        sc.nextLine();  // Limpa o buffer do \n

        // Retorno menu
        if(op == 1){
          System.out.print("Digite o nome: ");
          String nome = sc.nextLine();
          Fila.enfileira(nome);
        }
        else if(op == 2){
          String nome = Fila.desinfileira();
          System.out.printf("\n%s, favor comparecer na recepção.\n", nome);
        }
        else if(op == 3){
          System.out.println("Lista de espera:");
          Fila.imprime();
          System.out.println("");
        }
        else if(op == 4){
          int quantidade = Fila.tamanho();
          System.out.printf("\nHá %d pessoa(s) na fila.\n", quantidade);
        }
        else if(op == 5){
          System.out.println("Programa encerrado!");
        }
        else{
          System.out.println("Opção inválida! Tente novamente.");
        }

      }
      while(op != 5);  // Termina apenas na opção de sair

    }
}
