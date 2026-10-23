import java.util.*;

/* 5. Implemente uma função gerarSenha() que não recebe nada e retorna uma senha de 
8 caracteres aleatórios contendo letras maiúsculas, minúsculas e números.
*/

// Modo burro (não consegui desenvolver de forma melhor, mas estou tentando!)

public class Exercicio5 {

    // Método Principal

    public static void main(String[] args) {
      System.out.println("=== Exercício 5 ===\n\n");

      // Chamada método gerador 

      System.out.print("Sua nova senha é: " + gerarSenha());

    }

  // Método gerarSenha 

  public static String gerarSenha(){

    Random rand = new Random();  // Objeto random 
    int tam = 8; // Tamanho da senha
    String senha = new String("");  // String onde os caracteres sorteados serão concatenados
    String caracteres = new String("ABCDEFGHIJKLMNOPQRSTUVXYWZabcdefghijklmnopqrstuvxywz012345689");

    // Laço para pegar as posições e preencher a string senha 

    for(int i = 0; i < tam; i++){
      int idx = rand.nextInt(caracteres.length());
      char c = caracteres.charAt(idx);
      senha = senha + c;
    }

    return senha;

  }
}
