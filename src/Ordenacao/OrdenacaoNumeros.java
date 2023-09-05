package Ordenacao;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;


public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> orderAscendente = new ArrayList<>(this.numeros);
        if(!numeros.isEmpty()){
            Collections.sort(orderAscendente);
            return orderAscendente;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> orderDescendente = new ArrayList<>(this.numeros);
        if(!numeros.isEmpty()){
            orderDescendente.sort(Collections.reverseOrder());
            return orderDescendente;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
          System.out.println(this.numeros);
        } else {
          System.out.println("A lista está vazia!");
        }
      }
    
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
    
        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
    
        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
      }
    
}
