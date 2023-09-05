package List.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Item> itemlist;

    public CarrinhoDeCompra(){
        this.itemlist = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemlist.add(item);
    }
    public void removeItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        if(!itemlist.isEmpty()){
            for (Item i : itemlist){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itemsParaRemover.add(i);
                }
            }
        itemsParaRemover.removeAll(itemsParaRemover);
        }else{
            System.out.println("A lista está vazia!");
            }
    }   

    public double calcularValorTotal(){
        double valTotal = 0d;
        if(!itemlist.isEmpty()){
            for(Item item : itemlist){
                double valor = item.getPreco() * item.getQuantidade();
                valTotal += valor;
            }
            return valTotal;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
        
    
    }

    public void exibirItens(){
        if(itemlist.isEmpty()){
            System.out.println(this.itemlist);
        }else{
            System.out.println("A lista está vazia!");
            }
        
        
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompra { item = " + itemlist + "}";
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompra carrinhoDeCompras = new CarrinhoDeCompra();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removeItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}