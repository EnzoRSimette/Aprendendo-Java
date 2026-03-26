package expressoesLambda;
import java.util.*;
public class Aula1 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(2,3,4,5,6,7,8);
        lista.forEach((i) -> {if (i%2 == 0) {System.out.println(i);}}); // Igual o javascript
        // Não precisamos colocar Integer i pois o java sabe que a lista é de inteiros
    }
}
