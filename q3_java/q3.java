import java.util.ArrayList;
import java.util.Collections;

class Questao3 {

  public static void main (String[] args) {

    ArrayList<String> lista = new ArrayList<>();
    lista.add("AMARELO");
    lista.add("AZUL");
    lista.add("VERMELHO");
    lista.add("CINZA");
    lista.add("PRETO");

    System.out.println("Lista original: " + lista);
    
    // Remover item na posição 2.
    lista.remove(2);
    System.out.println("Lista após a remoção: " + lista);
    
    // Ordenar a lista.
    Collections.sort(lista);
    System.out.println("Lista após a ordenação: " + lista);

    alterar(lista, 2, "BRANCO");
  }
  
  // implementar nas linhas abaixo o método alterar.
  public static void alterar (ArrayList lista, int indice, String novaCor) {
    lista.set(indice, novaCor);
    System.out.println("Lista após a alteração: " + lista);
  }

}
