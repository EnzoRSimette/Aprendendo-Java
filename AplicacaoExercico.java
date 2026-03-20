class ExercicioLivro {
    public String titulo = "Desconhecido";
    private String autor = "Desconhecido";
    protected int anoPublicacao = 0;
    double preco = 0.0;

    ExercicioLivro() {}

    ExercicioLivro(String tituloInit, String autorInit) {
        this.titulo = tituloInit;
        this.autor = autorInit;
    }

    ExercicioLivro(String tituloInit, String autorInit, int anoInit, double precoInit) {
        this.titulo = tituloInit;
        this.autor = autorInit;
        this.anoPublicacao = anoInit;
        this.preco = precoInit;
    }

    public static void exibirInformacoes(ExercicioLivro livro) {
        System.out.println(livro.titulo);
        System.out.println(livro.autor);
        System.out.println(livro.anoPublicacao);
        System.out.println(livro.preco);
    }
}

public class AplicacaoExercico {
    public static void main(String[] args) {
        ExercicioLivro livro1 = new ExercicioLivro();
        ExercicioLivro livro2 = new ExercicioLivro("O homem por trás do mundo", "Jorge Barros Filho");
        ExercicioLivro livro3 = new ExercicioLivro("Mais do mundo", "Lucas Noehl", 2014, 48.99);
        ExercicioLivro.exibirInformacoes(livro1);
        ExercicioLivro.exibirInformacoes(livro2);
        ExercicioLivro.exibirInformacoes(livro3);
    }
}
