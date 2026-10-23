import java.util.*;

/* 10. Crie um procedimento que receba um número e imprima sua tabuada de 1 a 10.
*/

public class Exercicio10 {

  // Método Principal

    public static void main(String[] args) {
      System.out.println("=== Exercício 3 === \n\n");

      // Objeto Scanner

      Scanner sc = new Scanner(System.in);
      System.out.print("Insira um número inteiro: ");
      int num = sc.nextInt();
      sc.nextLine();  // Limpa o buffer do \n 

      // Chamada do método tabuadaNum

      tabuadaNum(num);

    }

  // Método tabuadaNum

  public static void tabuadaNum(int n){

    System.out.printf("\nTabuada de %d:\n", n);
    
    for(int i = 0; i <= 10; i++){
      System.out.println(n + " x " + i + " = " + (n * i));
    }

    System.out.println();

  }
}
