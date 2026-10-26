import java.util.*;

// 2) b) Soma de dois números naturais, através de incrementos sucessivos 
// (Ex.:3 + 2 =+ + (+ + 3)).

public class Ex2b {

    public static void main(String[] args) {

      System.out.println("=== Lista de Exercícios de Recursividade ===\n");
      System.out.println("Exercício 2.b");

      int result = somaNumNat(3, 2);
      System.out.println(result);
    }

    public static int somaNumNat (int n1, int n2){

      if(n2 == 0){
        return n1;
      }
      else{
        return (1 + somaNumNat(n1, n2-1));
      }

    }
}