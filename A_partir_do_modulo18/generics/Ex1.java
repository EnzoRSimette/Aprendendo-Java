package generics;

public class Ex1 {

    public static void main(String[] args) {
        Cesto<Peixe> CaixaDePeixes = new Cesto<>();
        Cesto<Polvo> polvo1 = new Cesto<>();
        CaixaDePeixes.guardar(new Peixe("Sergio", 20000));
        polvo1.guardar(new Polvo("Rabaum", 12));
        Peixe peixe2 = CaixaDePeixes.pegar();
        System.out.println(peixe2.getNome());
    }

}

class Peixe {
    private String nome;
    private int tamanho;

    public Peixe(String nomeInit, int tamanhoInit) {
        this.nome = nomeInit;
        this.tamanho = tamanhoInit;
    }

    public String getNome() {
        return this.nome;
    }
}

class Cesto<T> {
    private T conteudo;

    void guardar(T coisa) {
        this.conteudo = coisa;
    }

    T pegar() {
        return this.conteudo;
    }
}

class Polvo {
    private String nome;
    private int tentaculos;

    public Polvo(String nomeInit, int tentaculosInit) {
        this.nome = nomeInit;
        this.tentaculos = tentaculosInit;
    }
}
