//package pilha;

public class Pilha {

      private static String item[];
      private static int topo;

      // Métodos

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
              //System.out.println("Pilha cheia!"); 
              return;
          }
          item[topo++] = elemento;
      }
      
      public static String desempilha(){
          if (vazia()){
              //System.out.println("Erro: pilha vazia");
              return null;
          }
          return item[--topo];
      }
      
      public static void imprime(){
        if (vazia()) {
          System.out.println("Pilha vazia!");
          return;
        }
        for(int i = topo - 1; i >= 0; i--){
          System.out.println(item[i]); 
        }
      }
      
}
