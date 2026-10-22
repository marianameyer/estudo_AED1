// Lista: pode-se retirar elemento de qualquer posição do array. Após retirado, desloca-se
// o vetor.

public class Lista{

  // Parâmetros privados
  private static String[] lista;
  private static int inicio, fim;

  // Método para criação da lista vazia
  public static void fazListaVazia(int tam){
    lista = new String[tam];
    inicio = 0;
    fim = 0;
    System.out.println("Lista criada!");
  }

  // Métodos para verificar se a lista está vazia ou cheia
  public static boolean vazia(){
    return (inicio == fim);
  }

  public static boolean cheia(){
    return (fim >= lista.length);
  }

  // Insere item na lista 
  public static void insere(String item){
    if(cheia()){
      System.out.println("[Erro] Lista cheia!");
      return;
    }
    else{
      lista[fim++] = item;  // Após receber o item, fim é incrementado
    }
  }

  // Retira item da lista 
  public static void retira(String item){
    if(vazia()){
      System.out.println("[Erro] Lista vazia!");
    }
    else{
      int posicao = -1;
      // Procura o item na lista
      for(int i = inicio; i < fim; i++){
        if(lista[i].equals(item)){
          posicao = i;
          break;
        }
      }
      if(posicao != -1){
        for(int j = posicao; j < fim - 1; j++){
          lista[j] = lista[j+1];
        }
        fim--;
        lista[fim] = null;
      }
      else{
        System.out.println("[Erro] Item não encontrado!");
      }
    }
  }

  // Imprime a lista 
  public static void imprimeLista(){
    for(int i = inicio; i < fim; i++){
      System.out.print(lista[i] + "  ");
    }
  }
  
}
