import java.util.*;

/* Ex1) Crie um programa em Java que faça o seguinte:
  - Peça ao usuário para digitar um número inteiro.
  - O programa deve verificar se o número digitado é par ou ímpar.
  - Imprima a resposta na tela.
*/

public class Ex1 {

    // Método Principal

    public static void main(String[] args) {

      System.out.println("=== Exercício 1 ===\n");

      // Objeto Scanner
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite um número inteiro: ");
      int num = sc.nextInt();

      if(num % 2 == 0){
        System.out.print("\nO número digitado é par!");
      }
      else{
        System.out.print("\nO número digitado é ímpar!");
      }

      sc.close();

    }
}
