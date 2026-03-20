package pacote_exemplo;

public class Exercicio_Encapsulamento {
    private String nome;
    private Double preco;
    private int quantidadeEmEstoque;

    public Exercicio_Encapsulamento(String nomeInit, Double precoInit, int quantidadeInit) {
        nome = nomeInit;
        preco = precoInit;
        quantidadeEmEstoque = quantidadeInit;
    }

    public String nome_fruta() {
        return "Nome da fruta: " + nome;
    }

    public String preco_fruta() {
        return "Preco fruta: " + preco;
    }

    public String quantiade_fruta() {
        return "Quantidade em estoque: " + quantidadeEmEstoque;
    }

    public String novo_nome(String novo_nome) {
        nome = novo_nome;
        return nome;
    }

    public Double novo_preco(Double novo_preco) {
        preco = novo_preco;
        return preco;
    }

    public int nova_quantidade(int nova_quant) {
        quantidadeEmEstoque = nova_quant;
        return quantidadeEmEstoque;
    }
}
