package collections;
import java.util.*;
public class Estoque {
    public static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>();
        Estoque.adicionarProduto("Banana", 2, estoque);
        Estoque.removerProduto("Banana", 1, estoque);
    }
    public static void adicionarProduto(String nome, int Quantidade, Map<String, Integer> mapa) {
        mapa.put(nome, Quantidade);
        System.out.println(nome + " Foi adicionado com a quantidade " + mapa.get(nome));
    }
    public static void removerProduto(String nome, int Quantidade, Map<String, Integer> mapa) {
        int quantidadeRemovida = mapa.get(nome) - Quantidade;
        mapa.put(nome, quantidadeRemovida);
        System.out.println(nome + " Foi atualizado com a quantidade " + mapa.get(nome));
    }
}
