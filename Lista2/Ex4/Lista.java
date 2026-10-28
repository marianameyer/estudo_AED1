public class Lista {
    
    private static String[] item;
    private static int ultimo, frente, tras, topo;  // Posição após o último inserido
    
    public static void fazListaVazia(int tam){
        item = new String[tam];
        ultimo = 0;
        frente = 0;
        tras = 0;
        topo = 0;
        System.out.println("Estrutura criada!");
    }
    
    // Métodos para inserção
    
    public static void insere(String elemento){
        if(ultimo >= item.length){
            System.out.println("Erro: Lista cheia!");
        }
        else{
            item[ultimo++] = elemento;
        }
    }
    
    public static void enfileira(String elemento){
        if((tras+1) % item.length == frente){
            System.out.println("Erro: Fila cheia!");
            return;
        }
        item[tras] = elemento;
        tras = (tras+1) % item.length;
    }
    
    public static void empilha(String elemento){
        if(topo == item.length){
            System.out.println("Erro: Pilha cheia!");
        }
        else{
            item[topo++] = elemento;
        }
    }
    
    // Métodos para retirar elemento
    
    public static String retira(String elemento){
      int posicao = -1;  // Posição do elemento, se houver
      for(int i = 0; i < ultimo; i++){
        if(item[i].equalsIgnoreCase(elemento)){  // procurando o índice a ser retirado
          posicao = i;  // posição do elemento a ser retirado
        }
      }
      for(int i = posicao; i < ultimo - 1; i++){
        item[i] = item[i+1];  // Deslocando os elementos para a esquerda
      }
      item[ultimo-1] = null;  // Limpa a última posição
      ultimo--;  // Decrementa o índice
      return item[posicao];  // Retorna o nome retirado
    }
    
    public static String desinfileira(){
        if(frente == tras){
            System.out.println("Erro: Fila vazia!");
            return null;
        }
        else{
            String elemento = item[frente];
            frente = (frente+1) % item.length;
            return elemento;
        }
    }
    
    public static String desempilha(){
          if (topo == 0){
              System.out.println("Erro: Pilha vazia!");
              return null;
          }
          return item[--topo];
      }

    // Métodos de impressão 

    public static void imprimeLista(){
        for(int i = 0; i < ultimo; i++){
            System.out.print(item[i] + "  ");
        }
    }

    public static void imprimeFila(){
        if(frente == tras){
            System.out.println("Lista vazia!");
        }
        else{
            for(int i = frente; i != tras; i = (i+1) % item.length){
                System.out.print(item[i] + "  ");
            }
        }
    }

    public static void imprimePilha(){
          for(int i = topo - 1; i >= 0; i--){
              System.out.println(item[i]); 
          }
      }
    
}