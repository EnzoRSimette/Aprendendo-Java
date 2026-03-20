package essencial_pt1;
public class ex_operadores {
    public static void main(String[] args) {
        int numero = 5;
        numero += 3;
        numero -= 2;
        numero *= 4;
        numero /= 2;
        System.out.println(numero);

        int contador = 5;
        contador++;
        contador--;
        System.out.println(contador);

        System.out.println("");
        int contador2 = 5;
        System.out.println(++contador2);
        System.out.println(contador2++);
        System.out.println(contador);
        System.out.println("");
        System.out.println(--contador2);
        System.out.println(contador2--);
    }
}
