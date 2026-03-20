package annotations;
public class AulaSupressWarning {
    @SuppressWarnings("deprecation") //! Vai suprimir o aviso de deprecated
    public static void main(String[] args) {
        InformaRegras regras = new InformaRegras();
        regras.mostrarRegrasAposentadoria(); // Para resolver o aviso é só não usar o método
        //^ javac -Xlint:deprecation .\AulaDepreacted.java -> Vai mostrar o erro exato
        regras.mostrarNovasRegrasAposentadoria();
    }
}

class InformaRegras {

    @Deprecated // Vai avisar que o que está em baixo é antigo e desatualizado
    public void mostrarRegrasAposentadoria() {
        System.out.println("Essas são as regras da aposentadoria");
    }

    public void mostrarNovasRegrasAposentadoria() {
        System.out.println("Essas são as NOVAS REGRAS de aposentadoria");
    }
}
