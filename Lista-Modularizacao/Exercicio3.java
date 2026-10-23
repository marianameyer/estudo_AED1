import java.util.*;

/* 3. Crie uma função exibirMenu() que exibe opções de um menu e retorna a opção 
escolhida pelo usuário como um inteiro.
*/

public class Exercicio3 {

  // Método Principal

    public static void main(String[] args) {
      System.out.println("=== Exercício 3 === \n\n");

      // Chamada método exibirMenu

      exibirMenu();

    }

  // Método exibirMenu

  public static void exibirMenu(){

    System.out.println("=== Menu ===");
    System.out.println("(1) Opção 1; \n(2) Opção 2; \n(3) Opção 3.");

    // Objeto Scanner

    Scanner sc = new Scanner(System.in);
    System.out.print("\nEscolha uma opção: ");
    int op = sc.nextInt();
    sc.nextLine();  // Limpa o buffer do \n 

    // Tratamento de entrada diferente 

    if(op < 1 || op > 3){
      System.out.println("Essa opção não existe! Tchau!");
    } else {
      System.out.printf("\nVocê escolheu a opção %d.", op);
    }

    System.out.println();

  }
}
