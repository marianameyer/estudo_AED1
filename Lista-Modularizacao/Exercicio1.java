import java.util.*;

/* 1. Crie uma função chamada rolarDado que não recebe argumentos, mas retorna um número 
aleatório entre 1 e 6, simulando um dado. */

public class Exercicio1 {

  // Método Principal

    public static void main(String[] args) {
      
      System.out.println("=== Exercício 1 === \n\nRetorna número aleatório.");

      // Chamada método rolarDado

      System.out.printf("O dado retornou %d.", rolarDado());

    }

  // Método que gera número aleatório entre 1 e 6

  public static int rolarDado(){

    // Criando o objeto

    Random rand = new Random();
    int dado = rand.nextInt(6) + 1; // nextInt() retorna 0, por isso a soma.

    return dado;
  }
}
