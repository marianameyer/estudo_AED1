import java.util.*;

/* 6. Crie uma função calcularExpressao que receba três valores: dois números e 
uma operação (+, -, *, /) e retorne o resultado da operação. 
Trate divisões por zero.
*/

/* Modo burro -> tentei fazer tudo dentro do método calcularExpressao, porém tinha 
retorno na divisão por zero (estou tentando fazer de um modo mais limpo e organizado). */

public class Exercicio6 {

  // Método Principal

    public static void main(String[] args) {
      System.out.println("=== Exercicio 6 === \n\n");
      System.out.println("Cálculo entre dois números. \n");

      // Objeto Scanner
      Scanner sc = new Scanner(System.in);
      System.out.print("\nDigite o primeiro número (n1): ");
      double n1 = sc.nextDouble();
      sc.nextLine();
      System.out.print("Digite o segundo número (n2): ");
      double n2 = sc.nextDouble();
      sc.nextLine();
      System.out.print("Qual operação deseja fazer? (+, -, *, /) ");
      String op = sc.nextLine();

      // Chamada do método calcularExpressao 

      if(n2 == 0.0 && op.contains("/")){
        System.out.printf("\nNão é possível dividir %.2f por 0!", n1);
      } else if(!op.contains("+") && !op.contains("-") && !op.contains("*") && !op.contains("/")){
        System.out.printf("\nOpção %s inválida!", op);
      } else{
        System.out.printf("\nO resultado é: %.2f %s %.2f = " + calcularExpressao(n1,n2,op), n1, op, n2); 
      }

    }

  // Método calcularExpressao 

  public static double calcularExpressao(double x, double y, String z){

      if(z.equals("+")){
        return (x + y);
      } else if(z.equals("-")){
        return (x - y);
      } else if(z.equals("*")){
        return (x * y);
      } else if(z.equals("/")){
        return (x / y);
      }

    return 0;
  }
}
