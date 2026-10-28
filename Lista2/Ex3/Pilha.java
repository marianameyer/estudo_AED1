//package pilha;

public class Pilha {
  
      private static String item[];
      private static int topo;

      public static void fazPilhaVazia(int tam){
          item = new String[tam];
          topo = 0;
          System.out.println("Pilha criada!");
      }      
      
      public static boolean vazia(){
          return (topo == 0);
      }
      
      public static boolean cheia(){
          return (topo == item.length);
      }
      
      public static void empilha(String elemento){
          if(cheia()){
              System.out.println("Erro: pilha cheia!"); 
              return;
          }
          item[topo++] = elemento;
      }
      
      public static String desempilha(){
          if (vazia()){
              System.out.println("Erro: pilha vazia!");
              return null;
          }
          return item[--topo];
      }
      
      public static void imprime(){
          for(int i = topo - 1; i >= 0; i--){
              System.out.println(item[i]); 
          }
      }
      
      public static String espiar(){
        return item[topo-1];
      }

      public static int tamanho(){
        return topo;
      }

}
