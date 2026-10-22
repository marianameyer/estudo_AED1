// Pilha: os elementos são empilhados e desempilhados, obedecendo a disciplina LIFO (last 
// in, first out).

public class Pilha{

  // Atributos privados
  private static String[] pilha;
  private static int topo;

  // Método para criar a pilha vazia 
  public static void fazPilhaVazia(int tam){
    pilha = new String[tam];
    topo = 0;
    System.out.println("Pilha criada!");
  }

  // Métodos para verificação de pilha cheia e vazia 
  public static boolean vazia(){
    return (topo == 0);
  }

  public static boolean cheia(){
    return (topo >= pilha.length);
  }

  // Método para empilhar 
  public static void empilha(String item){
    if(cheia()){
      System.out.println("[Erro] Pilha cheia!");
    }
    else{
      pilha[topo++] = item;
    }
  }

  // Método para desempilhar 
  public static String desempilha(){
    if(vazia()){
      System.out.println("[Erro] Pilha vazia!");
      return null;
    }
    else{
      topo--;
      String item = pilha[topo];
      pilha[topo] = null;
      return item;
    }
  }

  // Método para imprimir a pilha 
  public static void imprime(){
    if(vazia()){
      System.out.println("[Erro] Pilha vazia!");
    }
    else{
      for(int i = topo - 1; i >= 0; i--){
        System.out.println(pilha[i]);
      }
    }
  }
}
