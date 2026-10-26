import java.util.*;

// 2) g) Cálculo de: 2/4 + 5/5 + 10/6 + 17/7 + 26/8 + ... + (n²+1)/(n+3)

public class Ex2g {

    public static void main(String[] args) {

      System.out.println("=== Lista de Exercícios de Recursividade ===\n");
      System.out.println("Exercício 2.g");

      Double result = calculaSerieFracoes(3);
      System.out.println(result);
    }

    public static Double calculaSerieFracoes(int n){

      if(n <= 0){
        return 0.0;
      }
      else{
        return (((Math.pow(n, 2) + 1)/(n + 3.0)) + calculaSerieFracoes(n-1));
      }
    }
}