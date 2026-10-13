import java.util.*;

/* 7. Implemente uma função autenticar que receba usuário e senha e retorne true ou 
false se as credenciais forem válidas (valores fixos: admin / 1234).
*/

// Acho que não entendi o exercício direito, acabei fazendo um condicional dentro do main...

public class Exercicio7 {

    // Método Principal

    public static void main(String[] args) {
      System.out.println("=== Exercício 7 === \n\n");

      // Objeto Scanner

      Scanner sc = new Scanner(System.in);
      System.out.print("Digite o usuário: ");
      String user = sc.nextLine();
      System.out.print("\nDigite a senha: ");
      int senha = sc.nextInt();
      sc.nextLine();

      // Chamada método autenticaCredenciais

      boolean acesso = autenticaCredenciais(user, senha);
      
      // Verificação

      if(acesso){
        System.out.println("\nCredencial válida!");
      } else{
        System.out.println("\nCredencial inválida!");
      }
      
    }

  // Método autenticaCredenciais

  public static boolean autenticaCredenciais(String u, int p){

    // Verificador

    if(u.equals("admin") && p == 1234){
      return true;
    } else{
      return false;
    }

  }
}