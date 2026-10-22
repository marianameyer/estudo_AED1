// Fila: obedece a disciplina FIFO (first in, first out). Neste caso, farei a fila 
// circular, que atende os requisitos estudados.

public class Fila{

  // Atributos Privados
  private static String[] fila;
  private static int frente, tras;

  // Criação de uma fila vazia 
  public static void fazFilaVazia(int tam){
    fila = new String[tam];
    frente = 0;
    tras = 0;
    System.out.println("Fila criada!");
  }
  
  // Métodos para verificar se a fila está cheia ou vazia 
  public static boolean vazia(){
    return (frente == tras);
  }

  public static boolean cheia(){
    return ((tras+1)%fila.length == frente);
  }

  // Populando a fila 
  public static void enfileira(String item){
    if(cheia()){
      System.out.println("[Erro] Fila cheia!");
    }
    else{
      fila[tras] = item;
      tras = (tras + 1) % fila.length;
    }
  }

  // Removendo item da fila
  public static String desenfileira(){
    if(vazia()){
      System.out.println("[Erro] Fila vazia!");
      return null;
    }
    else{
      String item = fila[frente];
      fila[frente] = null;
      frente = (frente + 1) % fila.length;
      return item;
    }
  }

  // Imprime a fila 
  public static void imprime(){
    if(vazia()){
      System.out.println("[Erro] Fila vazia!");
    }
    else{
      for(int i = frente; i != tras ;i = (i+1) % fila.length){
        System.out.print(fila[i] + "  ");
      }
    }
  }
}
