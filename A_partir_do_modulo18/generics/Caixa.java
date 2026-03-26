package generics;

public class Caixa<T> {
    private T[] elementos; // Array
    public Caixa(int capacidade) {
        elementos = (T[]) new Object[capacidade]; // Cria um array de objetos com capacidade do construtor
    }

    public void adicionar(T elemento, int indice) { // Adiciona um elemento no indice dentro do array de elementos
        elementos[indice] = elemento;
    }

    public T obter(int indice) {    // Obtem o item no indice do array
        return elementos[indice];
    }
    public static void main(String[] args) {
        Caixa<Double> caixaDePrecos = new Caixa<>(3);
        caixaDePrecos.adicionar(10.5, 0);
        caixaDePrecos.adicionar(20.0, 1);

        System.out.println(caixaDePrecos.obter(0));
        System.out.println(caixaDePrecos.obter(1));

        Caixa<Character> caixaDeLetras = new Caixa<>(2);

        caixaDeLetras.adicionar('A', 0);
        caixaDeLetras.adicionar('B',1);
        System.out.println(caixaDeLetras.obter(0));
        System.out.println(caixaDeLetras.obter(1));

    }
}