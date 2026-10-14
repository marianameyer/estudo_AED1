import java.util.*;

// Recursividade

/* Exercício: Inverter uma String
Escreva um método recursivo em Java que receba uma String e retorne essa String invertida.
Exemplo: Entrada: "java"
Retorno esperado: "avaj"
*/

public class InverteString {

    public static void main(String[] args) {

      System.out.println("===== Inverte uma String =====");

      // Entrada do usuário
      Scanner sc = new Scanner(System.in);
      System.out.print("Insira a palavra: ");
      String palavra = sc.nextLine();
      palavra = palavra.trim();

      // Chamada do método
      String result = inverteString(palavra);
      System.out.println("A palavra invertida é: " + result);
    }

    public static String inverteString(String s){

      // Caso base 
      if(s.length() == 0){
        return "";
      }
      if(s.length() == 1){
        return String.valueOf(s.charAt(0));
      }
      else{
        return (s.charAt(s.length()-1) + inverteString(s.substring(0, s.length()-1)));
      }

    }
}