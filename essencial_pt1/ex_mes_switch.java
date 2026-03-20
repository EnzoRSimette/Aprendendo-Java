package essencial_pt1;
public class ex_mes_switch {
    public static void main(String[] args) {
        int mes = 3;
        switch (mes) {
            case 1:
                System.out.println("Estamos em Janeiro");
                break;
            case 2:
                System.out.println("Estamos em fevereiro");
            case 3:
                System.out.println("Estamos em março");
            default:
                System.out.println("Estou com preguiça");
                break;
        }
    }
}
