package expressoesLambda;
import java.util.*;

public class interfacesFuncionais {
    // Interfaces funcionais são interfaces com apenas 1 método abstrato
    /*
    Alguns benefícios das interfaces funcionais:
        * Expressões lambda
        * Polimorfismo
        * Anotação @FunctionalInterface
    */
   public double somar(double a, double b) {
    return a+b;
   }
   public double substrair(double a, double b) {
    return a-b;
   }
   public static void main(String[] args) {
        interfacesFuncionais calculadora = new interfacesFuncionais();
        System.out.println(calculadora.somar(1, 2));
   }
}
