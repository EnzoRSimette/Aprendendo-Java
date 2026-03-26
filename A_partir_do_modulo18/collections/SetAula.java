package collections;

// Precisa importar para usar
import java.util.*; // Importa todas as classes de java.util
// Ele não permite duplicatas
public class SetAula {
    // HashSet implementa Set
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>(); // Cria um conjunto
        //! SETs não matem ordem!
        // Indices funcionam da mesma maneira
        conjunto.add("Python");
        conjunto.add("Java");
        conjunto.add("C++");
        /* Verificando se um conjunto tem um elemento */
        System.out.println("Contem 'Java'? " + conjunto.contains("Java"));
        conjunto.add("Javascript");
        conjunto.add("Ruby");

        // Imprimindo tudo...
        System.out.println(conjunto); // imprime [Java, C++, Javascript, Ruby, Python]

        conjunto.remove("Python");

        System.out.println(conjunto); // imprime [Java, C++, Javascript, Ruby]

        conjunto.clear();

        System.out.println(conjunto); // Vai retornar []
    }
}
