// TAD - Estruturas de Dados em Arranjos
// Lista 

public class Lista {
    
    private Object[] item;
    private int ultimo;  // aponta para próxima posição vazia
    private int cursor;  // aponta para o elemento desejado
    
    // Cria lista 

    public Lista(int tam){
        this.item = new Object[tam];
        this.ultimo = 0;
        this.cursor = 0;
    }
    
    // Método para verificar tamanho 

    public int tamanho(){
      return this.ultimo;
    }

    // Método para imprimir 

    public void imprime(){
      for(int i = 0; i < this.ultimo; i++){
        System.out.println(this.item[i]);
      }
    }

    // Método para inserção
    
    public void insere(Object elemento){
        if(this.ultimo >= item.length){
            System.out.println("Erro: Lista cheia!");
        }
        else{
            this.item[this.ultimo++] = elemento;
        }
    }
    
    
    // Método para retirar elemento
    
    public Object retira(Object elemento){
      if(tamanho() == 0){
        System.out.println("Lista vazia!");
        return null;
      }
      for(int i = 0; i < this.ultimo; i++){
        if(this.item[i].equals(elemento)){  
          Object retorno = this.item[i];
          for(int j = i+1; j < this.ultimo; j++){
            this.item[j-1] = this.item[j];
          }
          this.ultimo--;
          return retorno;
        }
      }
      System.out.println("Elemento inexistente!");
      return null;
    }

    // Método para verificar se duas listas são iguais 

    public boolean equals(Object o){
      Lista outra = (Lista) o;
      if(this.tamanho() != outra.tamanho()){
        return false;
      }
      Object aux;
      boolean flag;
      for(int i = 0; i < this.ultimo; i++){
        aux = this.item[i];
        flag = false;
        for(int j = 0; j < outra.ultimo; j++){
          if(outra.item[j].equals(aux)){
            flag = true;
            break;
          }
        }
        if(!flag){
          return false;
        }
      }
      return true;
    }
    
  // Método para concatenar duas listas 

  public Lista concatena(Lista o){
    if(this.item.length - this.tamanho() < o.tamanho()){
      int tam = (this.tamanho() + o.tamanho()) * 2;
      Lista aux = new Lista(tam);
      for(int i = 0; i <  this.ultimo; i++){
        aux.insere(this.item[i]);
      }
      this.item = aux.item;
      this.ultimo = aux.ultimo;
    }
    for(int i = 0; i < o.tamanho(); i++){
      this.insere(o.item[i]);
    }
    return this;
  }

  // Método para pesquisar elemento 

  public Object pesquisa(Object elemento){
    for(int i = 0; i < this.ultimo; i++){
      if(this.item[i].equals(elemento)){
        System.out.println("Elemento encontrado!");
        return this.item[i];
      }
    }
    System.out.println("Elemento inexistente!");
    return null;
  }

  // Métodos para retornar o primeiro e o próximo elemento (sem retirada)

  public Object first(){
    if(this.ultimo == 0){
      System.out.println("Lista vazia!");
      return null;
    }
    else{
      this.cursor = 0;
      return this.item[this.cursor];
    }
  }

  public Object next(){
    this.cursor++;  // Incrementa para o próximo
    if(this.cursor < this.ultimo){
      return this.item[this.cursor];
    }
    else{
      System.out.println("Não há próximo elemento...");
      return null;
    }
  }
    
}