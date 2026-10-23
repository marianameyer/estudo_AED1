import java.util.*;

/* 8. Crie um procedimento que gere aleatoriamente 30 temperaturas (entre 10°C e 40°C), 
armazene em um array e imprima: 
  - A maior temperatura
  - A menor temperatura
  - A média das temperaturas
*/

public class Exercicio8 {

  // Método Principal

    public static void main(String[] args) {
      System.out.println("=== Exercício 8 === \n\n");

      // Chamada do método para gerar o vetor  
      
      int[] temperaturas = geraTemperatura();
      System.out.println("Vetor gerado: " + Arrays.toString(temperaturas));

      // Chamada do método para imprimir os dados

      imprimeTemperatura(temperaturas);

    }

  // Método geraTemperatura

  public static int[] geraTemperatura(){

    Random rand = new Random();  // Objeto random
    int[] vetorTemperatura = new int[30];  // Vetor de temperaturas
    int tempMin = 10;  // Temperatura mínima a ser gerada 
    int tempMax = 40;  // Temperatura máxima a ser gerada 

    // Gerando e preenchendo o vetor com temperaturas

    for(int i = 0; i < vetorTemperatura.length; i++){
      // "Gambiarra" para random ser no intervalo (não consegui pensar em um modo melhor)
      vetorTemperatura[i] = rand.nextInt((tempMax - tempMin) + 1) + tempMin;
    }

    return vetorTemperatura;

  }

  // Método mediaTemp
  public static double mediaTemp(int[] v){

    double soma = 0.0;

    for(int i = 0; i < v.length; i++){
      soma = soma + v[i];
    }

    return (soma/v.length);
  }

  // Método maxTemp

  public static int maxTemp(int[] v){
    
    int maior = v[0];  // O primeiro elemento para comparar com os outros elementos

    for(int i = 0; i < v.length; i++){
      if(maior < v[i]){
        maior = v[i];
      }
    }
    return maior;
  }

  // Método minTemp

  public static int minTemp(int[] v){

    int menor = v[0];  // O primeiro elemento para comparar com os outros elementos

    for(int i = 0; i < v.length; i++){
      if(menor > v[i]){
        menor = v[i];
      }
    }
    return menor;
  }

  // Método imprimeTemperatura

  public static void imprimeTemperatura(int[] v){

    System.out.printf("\nA média das temperaturas é: %.2fºC.", mediaTemp(v));
    System.out.printf("\nA temperatura mínima é: %dºC.", minTemp(v));
    System.out.printf("\nA temperatura máxima é: %dºC.", maxTemp(v));

  }

}
