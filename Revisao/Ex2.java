import java.util.*;

/* Ex2) O Desafio:
Uma loja dá desconto baseando-se no valor total da compra:
  - Compras a partir de R$ 100,00 até R$ 200,00 recebem 10% de desconto.
  - Compras acima de R$ 200,00 recebem 15% de desconto.
  - Compras abaixo de R$ 100,00 não recebem desconto.
O que seu programa deve fazer:
  1) Solicitar ao usuário o valor total da compra (double).
  2) Calcular o valor do desconto (se houver) e o valor final a pagar.
  3) Imprimir na tela o valor original, a porcentagem de desconto aplicada e o valor 
  final já com o desconto.
*/

public class Ex2 {

    // Método Principal

    public static void main(String[] args) {

      System.out.println("=== Exercício 2 ===\n");

      // Objeto Scanner
      Scanner sc = new Scanner(System.in);
      System.out.print("\nValor da compra: R$");
      double valor = sc.nextDouble();

      // Chamada do método desconto
      System.out.print("\n=== Resumo da Compra ===");
      System.out.printf("\nValor original: R$%.2f;", valor);
      aplicarDesconto(valor);

      sc.close();
    }

    // Método aplicarDesconto 

    public static void aplicarDesconto(double valor){

      double valorfinal = 0;
      String desconto = new String();

      if(valor >= 100.00 && valor <= 200.00){
        desconto = "10%";
        valorfinal = valor * 0.90;
      }
      else if(valor > 200){
        desconto = "15%";
        valorfinal = valor * 0.85;
      }
      else{
        desconto = "0%";
        valorfinal = valor;
      }
      System.out.printf("\nDesconto aplicado: %s; \nValor final: R$%.2f.", desconto, valorfinal);
    }
}
