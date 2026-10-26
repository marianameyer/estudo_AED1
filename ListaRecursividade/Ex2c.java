import java.util.*;

// 2) c) Inversão de uma string.

public class Ex2c {

    public static void main(String[] args) {

      System.out.println("=== Lista de Exercícios de Recursividade ===\n");
      System.out.println("Exercício 2.c");

      String result = inverteString("Paralelepipedo");
      System.out.println(result);
    }

    public static String inverteString(String n){

      if(n.length() == 1){
        return n;
      }
      else{
        return (n.charAt(n.length()-1) + inverteString(n.substring(0, n.length()-1)));
      }

    }
}