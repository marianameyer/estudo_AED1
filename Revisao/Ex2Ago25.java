import java.util.*;

/* Ex2) Faça um método estático para calcular a série:
Som(i=1 -> n) (x-2)^2-1
*/

public class Ex2Ago25 {

  // Método principal
    public static void main(String[] args) {

      System.out.println("=== Exercício 2 - 25/08/26 ===\n");

      // Objeto Scanner
      Scanner sc = new Scanner(System.in);
      System.out.print("Insira o limite superior: ");
      int limiteSup = sc.nextInt();

      // Chamada do método serieSimples()
      serieSimples(limiteSup);
      sc.close();  // Termina o Scanner (tô esquecendo de colocar!!!)
    }

    // Método de série
    public static int serieSimples(n){
      for(int i = 1; i <= n; i++){
        
      }
    }
}
