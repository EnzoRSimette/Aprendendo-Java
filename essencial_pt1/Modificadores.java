package essencial_pt1;
import pacote_exemplo.Funcionario;

public class Modificadores {
    /*
    ~ Existem 4 tipos de modificadores de acesso:
        * Public -> Padrão, todo mundo pode acessar
        ! Private -> Só a classe atual onde ele está pode acessar
        ? Protected -> Dentro da própria classe, dentro do mesmo pacote e qualquer subclasse também pode acessar
        Default -> É o pré-definido pelo compilador
    */
   private int id_funcionario;
   protected Double salario_func;
   public String nome_func;

}
