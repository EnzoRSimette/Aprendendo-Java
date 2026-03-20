package essencial_pt1;
public class ex_loops {
    public static void main(String[] args) {
        //* Primeiro exercício
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            soma += i;
        }
        System.out.println(soma);

        //& Segundo exercício
        int doces = 1;
        while (doces <= 3) {
            System.out.println("Eu comi " + doces + " doces");
            doces++;
        }

        //^ Terceiro exercício
        int n = 100;
        int soma2 = 0;
        for (int i = 1; i <= n; i++) {
            soma2 += i;
        }
        System.out.println(soma2);
    }
}
