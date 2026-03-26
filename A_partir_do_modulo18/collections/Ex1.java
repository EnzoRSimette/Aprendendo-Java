package collections;
import java.util.*;
public class Ex1 {
    public static void main(String[] args) {
        Set<Integer> conjuntoNum = new HashSet<>();
        conjuntoNum.add(1);
        conjuntoNum.add(2);
        conjuntoNum.add(3);
        conjuntoNum.add(4);
        conjuntoNum.add(5);
        System.out.println("Existe esse numero no conjunto? " + conjuntoNum.contains(1));
        System.out.println("Existe esse numero no conjunto? " + Ex1.verificarSeExiste(conjuntoNum, 5));
    }

    static Boolean verificarSeExiste(Set<Integer> array, int numeroVer) {
        boolean contem = array.contains(numeroVer);
        return contem;
    }
}