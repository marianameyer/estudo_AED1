import java.util.*;

// Recursividade

/* Exercício: Menor Elemento de um Vetor
Escreva um método recursivo em Java que receba um vetor de inteiros e retorne o menor 
valor contido nele.
Exemplo: Vetor: {14, 7, 32, 2, 19, 5}
Retorno esperado: 2
*/

public class MenorElementoVetor {

    public static void main(String[] args) {

      System.out.println("Retorna o menor elemento de um vetor:");

      // Vetor de inteiros
      int[] vetor = {14, 7, 32, 2, 19, 5};

      // Chamada do método
      int result = menorElementoVet(vetor);
      System.out.println("\nO menor elemento do vetor é: " + result);
    }

    public static int menorElementoVet(int[] vet){

      // Tamanho 
      int tam = vet.length - 1;
      int menor;
      int ultimo;

      // Caso base
      if(vet.length == 1){
        return vet[0];
      }
 
      else{

        menor = menorElementoVet(Arrays.copyOfRange(vet, 0, tam));
        ultimo = vet[tam];

        if(menor > ultimo){
          return ultimo;
        }
        else{
          return menor;
        }
      }

    }
}