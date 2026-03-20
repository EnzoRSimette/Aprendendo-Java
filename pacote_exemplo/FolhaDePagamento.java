package pacote_exemplo;
import pacote_exemplo.Funcionario; //~ É assim que se importa uma classe

public class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Enzo R", 1100.50);
        System.out.println(funcionario.obterInfo());
    }
}
