import java.util.*;

/* Ex5) O Desafio: Criar um programa que recebe um vetor de inteiros e devolve um novo 
vetor com os elementos em ordem invertida, sem usar métodos prontos do Java (como 
Collections.reverse).
O que seu programa deve fazer:
  - Solicitar ao usuário o tamanho do vetor.
  - Ler e armazenar os números no vetor original.
  - Criar o método public static int[] inverterVetor(int[] original) que:
    * Instancia um novo vetor de mesmo tamanho.
    * Preenche o novo vetor com os elementos do original de trás para frente.
    * Retorna esse novo vetor.
  - No main, imprimir os dois vetores.
*/

public class Ex5 {

  // Método principal
    public static void main(String[] args) {

      System.out.println("=== Exercício 5 ===\n");

      // Objeto Scanner
      Scanner sc = new Scanner(System.in);
      System.out.print("Qual o tamanho do vetor? ");
      int tamanho = sc.nextInt();

      // Armazena e popula o vetor
      int[] vetor = new int[tamanho];
      for(int i = 0; i < vetor.length; i++){
        System.out.printf("Insira o número da posição %d: ", i);
        int num = sc.nextInt();
        vetor[i] = num;
      }

      //Chamada do método inverterVetor 
      int[] vetorInvertido = inverterVetor(vetor);  // Armazena o vetor invertido
      // Uso do método para que o vetor saia bonitinho
      System.out.println("\nO vetor invertido fica: " + Arrays.toString(vetorInvertido));
      
    }

    // Método inverterVetor 
    public static int[] inverterVetor(int[] original){

      int tam = original.length;  // Preferi fazer assim para deixar mais clean
      int[] invertido = new int[tam];
      for(int i = 0; i < tam; i++){
        invertido[i] = original[tam-i-1];
      }
      return invertido;
    }
}
