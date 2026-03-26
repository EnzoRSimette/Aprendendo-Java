package collections;
import java.util.*;
public class MapAula {
    // É como um json
    // Chaves são únicas, valores são variados
    // Ele oferece alguns métodos novos como: put, ge, remove
    // É tratado como dicionário
    // HashMap implementa Map
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>(); //! Map não é ordenado
        //* Mas existe dois maps que mantem elementos ordenados -> LinkedHashMap e TreeMap
        mapa.put("Python", 10);
        mapa.put("Java", 20);
        mapa.put("Lisp", 99999);
        System.out.println(mapa);
        System.out.println(mapa.get("Python")); // Printa 10
        mapa.remove("Python");
        System.out.println(mapa);
    }
}
