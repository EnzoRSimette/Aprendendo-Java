package expressoesLambda;
@FunctionalInterface
interface Calcular {
    double calcular(double a, double b);
}

public class Calculadora2 {
    public static void main(String[] args) {
        Calcular somar = (a, b) -> a+b;
        Calcular subtrair = (a, b) -> a-b;
        Calcular multiplicar = (a, b) -> a*b;
        Calcular dividir = (a, b) -> a/b;
        Calcular potenciacao = (a, b) -> Math.pow(a, b);
        Calcular modulo = (a, b) -> a%b;
        Calcular raizDaSoma = (a, b) -> Math.sqrt(a + b);
        System.out.println(raizDaSoma.calcular(2, 8));
    }
}
