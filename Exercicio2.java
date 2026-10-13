import java.util.*;

/* 2. Crie um procedimento chamado exibirEstatisticas que receba um vetor de inteiros 
e imprima: 
  - Quantidade de números pares
  - Quantidade de ímpares
  - Média dos valores
*/

public class Exercicio2 {

  //Método Principal

    public static void main(String[] args) {
      System.out.println("=== Exercício 2 === \n\n");

      // Objeto Scanner

      Scanner sc = new Scanner(System.in);
      System.out.print("Insira o vetor de inteiros, separados por espaço: ");
      String entrada = sc.nextLine().trim();  // Achei melhor retirar os espaços no início/fim (caso ocorra) 

      // Vamos fatiar a string

      String[] fatias = entrada.split(" ");  // Separa a string em várias fatias 
      int[] vetorI = new int[fatias.length];  // array de inteiros 

      // Converte as strings em int e popula o array 

      for(int i = 0; i < fatias.length; i++){
        vetorI[i] = Integer.parseInt(fatias[i]);
      }
      

      // Chamada método 
      exibirEstatisticas(vetorI);
    }

  // Método exibirEstatisticas

  public static double exibirEstatisticas(int[] v){

    System.out.println("\nOs dados do vetor inserido são: \n");

    // Quantidade de números pares 
    int contpar = 0;  // Contador de números pares 
    int contimp = 0;  // Contador de números ímpares

    for(int i = 0; i < v.length; i++){
      if(v[i] % 2 == 0){
        contpar++;
      }else if(v[i] % 2 == 1){
        contimp++;
      }
    }

    System.out.printf("- Números pares: %d; \n- Números ímpares: %d;", contpar, contimp);

    // Quantidade de números ímpares 

    // Média dos valores  
    double soma = 0.0;  // Contador em double para a média ser em double também

    for(int i = 0; i < v.length; i++){
      soma = soma + v[i];
    }
    double media = soma / (v.length);

    System.out.printf("\n- Média igual a: %.2f.", media);

    return 0;

  }
}
