package essencial_pt1;
public class loops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { //* Faz um loop com a condição que você definir
            System.out.println(i);
        }

        int j = 3;
        while (j <= 10) { //! Faz até a condição se tornar falsa
            System.out.println(j);
            j++;
        }

        int k = 2;
        do { //& Faz uma vez, dai verifica se precisa fazer de novo
            System.out.println(k);
            k++;
        } while (k < 25);
    }
}
