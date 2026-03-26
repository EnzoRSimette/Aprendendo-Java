package generics;

/*
^ Generics servem para organizar melhor o código. Colocando apenas um tipo de valor dentro daquela classe, seja String, int...
    vantagens:
    ! Evita erros
    ! Verificação em tempo de compilação
    ! A letra <T> simboliza que a classe é generica
*/
// Para criar um generico de inteiro, se usa valueOf(i);
public class Generics<T> {
    private T coisaNaCaixa;
    public void guardar(T coisa) {
        this.coisaNaCaixa = coisa;
    }
    public T pegar() {
        return coisaNaCaixa;
    }
    /* ^ Esse código de cima pode ser reutilizado para criar outras instâncias com outros tipos de dados */
    public static void main(String[] args) {
        // Criando uma caixa para guardar Strings
        Generics<String> caixaDeTexto = new Generics<>();
        caixaDeTexto.guardar("Oi, mundo!");
        String texto = caixaDeTexto.pegar();
        System.out.println(texto);
    }
}

