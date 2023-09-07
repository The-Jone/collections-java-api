package Map.OrdenacaoMap;

import java.util.Comparator;
import java.util.Map;


public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private double preco;
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public double getPreco() {
        return preco;
    }
    @Override
    public String toString() {
        return "Livro{" +
        "Titulo = '" + titulo + '\'' +
        ", Autor = '" + autor + '\'' +
        ", Preco = " + preco +
        '}';
    }
    @Override
    public int compareTo(Livro l) {
        return Double.compare(preco, l.getPreco());
    }
}
class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>>{
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2){
        return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
    }
}
