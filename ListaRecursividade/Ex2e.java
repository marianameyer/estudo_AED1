import java.util.*;

// 2) e) Verifique se uma palavra é palíndromo. (Ex. aba, abcba, xyzzyx).

public class Ex2e {

    public static void main(String[] args) {

      System.out.println("=== Lista de Exercícios de Recursividade ===\n");
      System.out.println("Exercício 2.e");

      String palavra = "AraRa";

      boolean result = ehPalindromo(palavra);
      System.out.printf("A palavra \"%s\" ", palavra);
      System.out.println(result ? "é palíndromo!" : "não é palíndromo!");
    }

    public static boolean ehPalindromo(String s){

      // Padronizando a String
      s = s.toLowerCase().trim();

      if(s.length() <= 1){
        return true;
      }
      if(s.charAt(0) != s.charAt(s.length() - 1)){
        return false;
      }

      return ehPalindromo(s.substring(1, s.length() - 1));

    }
}