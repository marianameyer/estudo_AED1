//package fila;

public class Fila {
    
    private static String item[];
    private static int frente, tras;
    
    // Métodos
    
    public static void fazFilaVazia(int tam){
        frente = 0;
        tras = 0;
        item = new String[tam];
        System.out.println("Fila criada!");
    }
    
    public static void enfileira(String elemento){
        if((tras+1) % item.length == frente){
            System.out.println("Erro: Fila cheia!");
            return;
        }
        item[tras] = elemento;
        tras = (tras+1) % item.length;
    }
    
    public static String desinfileira(){
        if(frente == tras){
            //System.out.println("Erro: Fila vazia!");
            return null;
        }
        else{
            String elemento = item[frente];
            frente = (frente+1) % item.length;
            return elemento;
        }
    }
    
    public static void imprime(){
        if(frente == tras){
            //System.out.println("Lista vazia!");
        }
        else{
            for(int i = frente; i != tras; i = (i+1) % item.length){
                System.out.print(item[i] + "  ");
            }
        }
    }

    public static int tamanho(){
      if(tras >= frente){
        return (tras - frente);
      }
      else{
        return ((item.length - frente) + tras);
      }
    }
    
}