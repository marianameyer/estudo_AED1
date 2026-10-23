import java.util.*;

/* 4. Crie um procedimento verificarNumeroMagico que receba um número e informe: 
- Se é palíndromo
- Se é par 
- Se é múltiplo de 3
*/

// Modo burro -> estou tentando deixar melhor e mais compacto

// Exemplo excepcional: 282 faz parte das 3 opções! //

public class Exercicio4 {

  //Método Principal

    public static void main(String[] args) {
      System.out.println("=== Exercício 4 === \n\n");

      // Objeto Scanner
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite um número inteiro: ");
      int num = sc.nextInt();
      sc.nextLine();  // Limpa o buffer do \n 

      // Chamada do verificarNumeroMagico

      verificarNumeroMagico(num);

    }

  // Método verificador

  public static void verificarNumeroMagico(int n){

    boolean ver = false;  // Criei um verificador para as condições

    if(n % 2 == 0){
      System.out.printf("\nO número %d é par!", n);
      ver = true;
    }

    if(n % 3 == 0){
      System.out.printf("\nO número %d é divisível por 3!", n);
      ver = true;
    }

    // Convertendo o número em string para verificar se é palíndromo
    String numero = String.valueOf(n);
    boolean ehPalindromo = true;  // True pois números de apenas 1 dígito são palíndromo.

    for(int i = 0; i < numero.length()/2; i++){
      if(numero.charAt(i) != numero.charAt(numero.length() - 1 - i)){
        ehPalindromo = false;
        break;
      } 
    }

    if(ehPalindromo){
      System.out.printf("\nO número %d é palíndromo!", n);
      ver = true;
    }

    if(!ver){
      System.out.printf("\nO número %d não é par, nem divisível por 3 e nem um palíndromo...", n);
    }
    
    System.out.println();

  }
}
