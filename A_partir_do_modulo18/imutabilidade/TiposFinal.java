package imutabilidade;

public class TiposFinal {
    public final int SIX_SEVEN = 67; // Mesma coisa que const no JS
    final void metodoFinal() { //! Não pode ser sobrescrito
        System.out.println(SIX_SEVEN);
    }
}

final class ClasseFinal { //* Você não deixa ninguem herdar a classe

}
