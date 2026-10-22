import java.util.*;

/* Ex3) O Desafio: Você vai criar um gerador de tabuada.
O que seu programa deve fazer:
  - Solicitar ao usuário um número inteiro entre 1 e 10.
  - Se o usuário digitar um número fora dessa faixa (ex: -2 ou 15), o programa deve 
  exibir uma mensagem de erro e pedir o número novamente até que ele digite um valor válido.
  - Assim que receber um número válido, o programa deve imprimir a tabuada desse 
  número de 1 a 10.
*/

public class Ex3 {

  // Método Principal

    public static void main(String[] args) {

      System.out.println("=== Exercício 3 ===\n");

      // Objeto Scanner
      Scanner sc = new Scanner(System.in);

      // Loop while
      boolean op = true;
      while(true){
        
        System.out.print("Digite um número de 1 a 10: ");
        int num = sc.nextInt();

        if(num <= 0 || num > 10){
          System.out.println("Número inválido! Tente novamente.");
        }
        else{
          System.out.println("\nTabuada de " + num + ":");
          calculaTabuada(num);
          break;
        }

      }
    }

    // Método calcula tabuada 

    public static void calculaTabuada(int num){
      for(int i = 0; i <= 10; i++){
        System.out.printf("%d x %d = %d\n", num, i, (num*i));
      }
    }
}
