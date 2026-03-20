package essencial_pt1;
public class ex_loops_conv {
    public static void main(String[] args) {
        int codigoDeSaida = 3;
        for (int i = 1; i <= 10; i++) {
            if (i == codigoDeSaida && (codigoDeSaida == 10 || codigoDeSaida == 7 || codigoDeSaida == 3)) {
                System.out.println("Sistema parou, você chegou!");
                break;
            } else {
                System.out.println("Não é essa ou não existe");
            }
        }
    }
}
