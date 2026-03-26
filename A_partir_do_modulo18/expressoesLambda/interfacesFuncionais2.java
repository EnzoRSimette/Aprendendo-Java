package expressoesLambda;
import java.util.*;

@FunctionalInterface
interface Calculadora {
    double calcular(double a, double b);
}

public class interfacesFuncionais2 {
    public static void main(String[] args) {
        Calculadora soma = (a, b) -> a+b;
        Calculadora subtrair = (a, b) -> a-b;
        System.out.println(soma.calcular(1, 2)); // Soma é como se virasse a função que você quer usar nos argumentos a e b
    }
}
