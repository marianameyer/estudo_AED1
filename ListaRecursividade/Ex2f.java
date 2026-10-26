import java.util.*;

// 2) f) Cálculo de: 1 + 1/2 + 1/3 + 1/4 + ... + 1/N

public class Ex2f {

    public static void main(String[] args) {

      System.out.println("=== Lista de Exercícios de Recursividade ===\n");
      System.out.println("Exercício 2.f");

      Double result = calculaSerieHarmonica(3);
      System.out.println(result);
    }

    public static Double calculaSerieHarmonica(int n){

      if(n <= 1){
        return 1.0;
      }
      else{
        return ((1.0/n) + calculaSerieHarmonica(n-1));
      }
    }
}