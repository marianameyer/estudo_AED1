import java.util.*;

/* Ex1) Faça um método estático para desenhar a forma abaixo no monitor: (9x9)
----*----
---*-*---
–*---*--
-*-----*-
*-------*
-*-----*-
--*---*--
---*-*---
----*----
*/

public class Ex1Ago25 {

    // Método Principal
    public static void main(String[] args) {

      System.out.println("=== Exercício 1 - 25/08/26 ===\n");

      // Chamada do método
      geraFigura();

    }

    // Método para gerar a figura
    public static void geraFigura(){

      int tamanho = 9;  // Tamanho do grid 

      // Metade superior e linha central
      for(int i = 0; i <= tamanho/2; i++){
        for(int j = 0; j < tamanho; j++){
          if(j == (4-i) || j == (4+i)){
            System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
        System.out.println();  // Pula de linha
      }

      // Metade inferior
      for(int i = (tamanho/2) - 1; i >= 0; i--){
        for(int j = 0; j < tamanho; j++){
          if(j == (4-i) || j == (4+i)){
            System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
        System.out.println();  // Pula de linha
      }
    }
}
