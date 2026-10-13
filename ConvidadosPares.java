import java.util.*;

/* 1) Faça um programa para preencher um vetor com os 37 convidados para uma reunião
entre amigos. Crie um vetor de 37 elementos do tipo String e peça ao usuário para
informar cada nome armazenando-os no vetor. Ao final, exiba todas as pessoas nos
índices pares do vetor, isso é, v[0], v[2], v[4], .. , v[36].
*/

public class ConvidadosPares {

    public static void main(String[] args) {

      System.out.println("=== Exercício Resolvido 1 ===\n");

      String[] listaConvidados = new String[37];  // Declaração da lista 

      // Objeto Scanner
      Scanner sc = new Scanner(System.in);

      // Preenchimento do vetor de convidados 
      for(int i = 0; i < listaConvidados.length; i++){
        System.out.printf("Insira o convidado de índice %d: ", i);
        listaConvidados[i] = sc.nextLine().trim();
      }

      // Imprimindo a lista de convidados pares para o usuário 
      System.out.println("\nPessoas presentes nos índices pares:");
      for(int i = 0; i < listaConvidados.length; i++){
        if(i % 2 == 0){
          System.out.printf("(%d) - %s;\n", i, listaConvidados[i]);
        }
      }
    }
}