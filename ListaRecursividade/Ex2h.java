import java.util.*;

// 2) h) Implemente a busca binária em um vetor dado um número lido pelo usuário.

public class Ex2h {

    public static void main(String[] args) {

      System.out.println("=== Lista de Exercícios de Recursividade ===\n");
      System.out.println("Exercício 2.h");

      int[] vetor = {2, 5, 8, 12, 16, 38, 56, 72, 91};

      Scanner sc = new Scanner(System.in);
      System.out.println("Escolha um número: ");
      int num = sc.nextInt();
      sc.nextLine();

      System.out.printf("\nBusca binária de %d:\n", num);
      buscaBin(vetor, num);
    }

    public static void buscaBin(int[] v, int n){

      // Se o número não está no vetor
      if(v.length == 0){
        System.out.println("Não está no vetor!");
        return;
      }

      int meio = v.length / 2;

      // Se o número está no vetor
      if(n == v[meio]){
        System.out.println("Achou!");
        return;
      }
      // Busca na esquerda
      if(n < v[meio]){
        System.out.println("Procurando na metade esquerda do vetor...");
        buscaBin(Arrays.copyOfRange(v, 0, meio), n);
      }
      // Busca na direita
      else{
        System.out.println("Procurando na metade direita do vetor...");
        buscaBin(Arrays.copyOfRange(v, meio + 1, v.length), n);
      }

    }

}