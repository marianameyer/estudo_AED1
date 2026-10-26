import java.util.*;

// 2) i) A partir de um vetor de números inteiros, calcule a soma e o produto dos 
// elementos do vetor.

public class Ex2i {

    public static void main(String[] args) {

      System.out.println("=== Lista de Exercícios de Recursividade ===\n");
      System.out.println("Exercício 2.i");

      int[] vetor = {2, 3, 10, 5, 7, 3};

      int[] result = calculaSomaMult(vetor);
      System.out.println(Arrays.toString(result));
    }

    public static int[] calculaSomaMult(int[] v){

      int[] vetSomaMult = new int[2];  // Vetor de saída: {soma, multiplicação}
      int tam = v.length - 1;

      if(v.length <= 1){

        vetSomaMult[0] = v[0];
        vetSomaMult[1] = v[0];

        return vetSomaMult;
      }
      else{

        vetSomaMult = calculaSomaMult(Arrays.copyOfRange(v, 0, tam));
        
        vetSomaMult[0] = v[tam] + vetSomaMult[0];
        vetSomaMult[1] = v[tam] * vetSomaMult[1];

        return vetSomaMult;
      }
    }
}