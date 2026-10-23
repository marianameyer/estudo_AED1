import java.util.*;

/* 9. Implemente um mini-jogo onde: 
  - Um método sem retorno escolhe um número aleatório (entre 1 e 100) 
  - Um método sem retorno recebe os palpites do usuário
  - Um método com retorno verifica se o palpite está certo, maior ou menor
*/

/* Modo burro - Estou refazendo este exercício para incluir um while nele 
(ficaria bem melhor) */

public class Exercicio9 {

  // Variáveis globais (fiz como na aula de 18/08, se não, não funcionava, rs)
  static int numGerado;
  static int palpiteUsuario;

  //Método Principal

    public static void main(String[] args) {
      System.out.println("=== Exercício 9 === \n\n");

      // Chamada do método para gerar o número 
      geraNum();

      // Método para perguntar o palpite para o usuário 
      palpiteUser();

      // Chamada do método de verificação 
      int result = verificaPalpite();

    }

  // Método número aleatório

  public static void geraNum(){

    Random rand = new Random();  // Objeto random
    int max = 100;  // Limite máximo do gerador
    numGerado = rand.nextInt(max) + 1;

  }

  // Método palpite usuário 

  public static void palpiteUser(){

    Scanner sc = new Scanner(System.in);
    System.out.print("\nQual o seu palpite? ");
    palpiteUsuario = sc.nextInt();
    sc.nextLine();  // Limpa o buffer do \n 

  }

  // Método verifica palpite

  public static int verificaPalpite(){

    if(palpiteUsuario > numGerado){
      System.out.println("\nErrou! O seu palpite foi maior...");
      return 1;
    } else if(palpiteUsuario < numGerado){
      System.out.println("\nErrou! O seu palpite foi menor...");
      return -1;
    } else{
      System.out.println("\nParabéns! Você acertou!");
      return 0;
    }
  
  }
}
