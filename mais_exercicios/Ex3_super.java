package mais_exercicios;

public class Ex3_super {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 19);
        Estudante pessoa2 = new Estudante("Enzo", 16, 12345678);
        pessoa1.exibirInformacoes();
        pessoa2.exibirInformacoes();
    }
}

class Pessoa {
    private String nome;
    private int idade;
    Pessoa(String nomeInit, int idadeInit) {
        this.nome = nomeInit;
        this.idade = idadeInit;
    }
    public String mandarNome() {
        return this.nome;
    }
    public int mandarIdade() {
        return this.idade;
    }
    public void exibirInformacoes() {
        System.out.println("Nome da pessoa: " + this.mandarNome());
        System.out.println("Idade da pessoa: " + this.mandarIdade());
    }
}

class Estudante extends Pessoa {
    private int matricula;
    Estudante(String nomeInit, int idadeInit, int matriculaInit) {
        super(nomeInit, idadeInit);
        this.matricula = matriculaInit;
    }
    public void exibirInformacoes() {
        System.out.println("Nome do estudante: " + this.mandarNome());
        System.out.println("Idade do estudante: " + this.mandarIdade());
        System.out.println("Matricula do estudante: " + this.matricula);
    }
}
