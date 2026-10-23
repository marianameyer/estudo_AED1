import java.util.*;

/* Ex6) O Desafio: Um palíndromo é uma palavra ou frase que se lê da mesma forma de 
trás para frente (ex: "arara", "radar", "ovo"). Você criará um programa que verifica 
se uma palavra digitada é um palíndromo.
O que seu programa deve fazer:
  1. Pedir ao usuário para digitar uma palavra.
  2. Criar um método public static boolean ehPalindromo(String palavra) que:
    - Converta a palavra para letras minúsculas (para evitar divergências entre 'A' e 'a').
    - Verifique se a palavra lida do início para o fim é idêntica à palavra lida do fim 
    para o início.
    - Retorne true se for palíndromo e false caso contrário.
  3. No main, exibir uma mensagem informando se a palavra é ou não um palíndromo.

Dicas de Java:
  - Use palavra.toLowerCase() para deixar tudo em minúsculo.
  - Use palavra.charAt(i) para acessar o caractere na posição i (funciona parecido com 
  os índices do vetor!).
  - O tamanho de uma String se pega com palavra.length() (com parênteses!).
*/

public class Ex6V2 {

  // Método Principal
    public static void main(String[] args) {

      System.out.println("=== Lista 3 - Exercício 6 ===\n");

      // Objeto Scanner
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite uma palavra: ");
      String palavra = sc.next();

      // Chamada do método verificador
      System.out.printf("A palavra \"%s\" ", palavra);
      System.out.print(ehPalindromo(palavra) ? "é palíndromo." : "não é palíndromo.");
    }

    // Método verificador 
    public static boolean ehPalindromo(String palavra){
      palavra = palavra.toLowerCase().trim();  // Letras minúsculas e sem espaço no início/fim 
      for(int i = 0; i < palavra.length() / 2; i++){
        if(palavra.charAt(i) != palavra.charAt(palavra.length()-1-i)){
          return false;
        }
      }
      return true;
    }
}
