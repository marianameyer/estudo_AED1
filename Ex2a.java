import java.util.*;

// 2) a) Multiplicação de dois números naturais, através de somas sucessivas 
// (Ex.:6∗4 =4 + 4 + 4 + 4 + 4 + 4).

public class Ex2a {

    public static void main(String[] args) {

      System.out.println("=== Lista de Exercícios de Recursividade ===\n");
      System.out.println("Exercício 2.a");

      int result = multiNumNat(6, 4);
      System.out.println(result);
    }

    public static int multiNumNat (int n1, int n2){

      if(n1 == 1){
        return n2;
      }
      else{
        return (n2 + multiNumNat(n1-1, n2));
      }
    }
}