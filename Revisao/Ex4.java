import java.util.*;

/* Ex4) O Desafio: Você vai criar um programa que recebe as notas de uma turma e calcula 
estatísticas simples.
O que seu programa deve fazer:
  - Peça ao usuário para informar o tamanho da turma (quantos alunos).
  - Crie um vetor (double[]) com o tamanho informado.
  - Use um laço para preencher o vetor com as notas digitadas pelo usuário.
  - Crie um método separado (ex: analisarNotas(double[] notas)) que receba esse vetor e 
imprima:
    * A Média das notas.
    * A Maior nota.
    * Quantos alunos ficaram acima ou iguais à média.

*/

public class Ex4 {

  // Método Principal

    public static void main(String[] args) {

      System.out.println("=== Exercício 4 ===\n");

      // Objeto Scanner
      Scanner sc = new Scanner(System.in);
      System.out.print("Quantos alunos na turma? ");
      int num = sc.nextInt();

      double[] lista = new double[num];

      for(int i = 0; i < num; i++){
        System.out.printf("Digite a nota %d: ", (i+1));
        double nota = sc.nextDouble();
        lista[i] = nota;
      }

      // Chamada do método analisarNotas 
      analisarNotas(lista);
    }

  // Método

    public static void analisarNotas(double[] vetor){
      
      int num = vetor.length;

      System.out.println("\n=== Relatório ===");

      // Declaração de variáveis
      double soma = 0.0;
      double media = 0.0;
      double maiorNum = vetor[0];
      int acimaMedia = 0;

      // Média
      for(int i = 0; i < num; i++){
        soma += vetor[i];
      }
      media = soma / num;
      System.out.printf("\nMédia da turma: %.2f;", media);
    
      // Maior nota
      for(int i = 1; i < num; i++){
        if(maiorNum < vetor[i]){
          maiorNum = vetor[i];
        }
        else{
          maiorNum = maiorNum;
        }
      }
      System.out.printf("\nMaior nota: %.2f;", maiorNum);

      // Quantidade de alunos acima da média 
      for(int i = 0; i < num; i++){
        if(vetor[i] >= media){
          acimaMedia++;
        }
      }
      System.out.printf("\nAlunos acima/na média: %d.", acimaMedia);

    }

}
