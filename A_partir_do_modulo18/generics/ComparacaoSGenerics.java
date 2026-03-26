package generics;

public class ComparacaoSGenerics {
    public static void main(String[] args) {
        CaixaDeBrinquedos caixaCarrinhos = new CaixaDeBrinquedos();
        caixaCarrinhos.guardar(new Carrinho("Hot wheels"));
        CaixaDeBrinquedos caixaBonecas = new CaixaDeBrinquedos();
        caixaBonecas.guardar(new Boneca("Barbie"));

        if (caixaCarrinhos.pegar() instanceof Carrinho) {
            Carrinho carrinho = (Carrinho) caixaCarrinhos.pegar();
        }
    }
}

class CaixaDeBrinquedos {
    private Object coisaNaCaixa;
    public void guardar(Object coisa) {
        this.coisaNaCaixa = coisa;
    }
    public Object pegar() {
        return coisaNaCaixa;
    }
}
