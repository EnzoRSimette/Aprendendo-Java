package generics;

public class Comparacao {
    public static void main(String[] args) {
        Carrinho c = new Carrinho("Hot wheels");
        Boneca b = new Boneca("Barbie");
        System.out.println(c.getModelo());
        System.out.println(b.getNome());
    }
}

class Carrinho {
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public Carrinho(String modelo) {
        this.modelo = modelo;
    }
}

class Boneca {
    private String nome;

    public String getNome() {
        return nome;
    }

    public Boneca(String nome) {
        this.nome = nome;
    }
}
