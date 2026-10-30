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

    public static boolean vazia(){
        return frente == tras;
    }

    public static boolean cheia(){
        return (tras + 1) % item.length == frente;
    }
    
    public static void enfileira(String elemento){
        if(cheia()){
            System.out.println("Erro: Fila cheia!");
            return;
        }
        item[tras] = elemento;
        tras = (tras+1) % item.length;
    }
    
    public static String desinfileira(){
        if(vazia()){
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
        if(vazia()){
          System.out.println("Lista vazia!");
        }
        else{
            for(int i = frente; i != tras; i = (i+1) % item.length){
                System.out.print(item[i] + "  ");
            }
            System.out.println();
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