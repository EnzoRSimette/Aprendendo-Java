package collections;
import java.util.*;
public class ListAula {
    // Ela permite elementos duplicados, diferente de Set
    // Exemplo: ArrayList implementa List
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Python");
        lista.add("C++");
        lista.add("Java");
        System.out.println(lista);
        System.out.println(lista.get(2)); // Vai pegar o terceiro elemento
        lista.add("Java"); // Duplicado
        System.out.println(lista);
        // Podemos fazer todas as operações que fizemos com Set
    }
}
