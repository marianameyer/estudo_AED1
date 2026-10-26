import java.util.*;

// 2) d) Impressão de um número natural em base binária

public class Ex2d {

    public static void main(String[] args) {

      System.out.println("=== Lista de Exercícios de Recursividade ===\n");
      System.out.println("Exercício 2.d");

      String n = numNatBin(7);
      System.out.println(n);
    }

    public static String numNatBin(int num){

      int resto, bin;

      if(num == 0){
        return "0";
      }
      else{
        resto = num / 2;
        bin = num % 2;
        return numNatBin(resto) + "" + bin;
      }

    }
}