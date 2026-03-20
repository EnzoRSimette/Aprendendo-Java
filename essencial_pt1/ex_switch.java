package essencial_pt1;
public class ex_switch {
    public static void main(String[] args) {
        int nivel = 5;
        switch (nivel) {
            case 1:
                System.out.println("Muito Insatisfeito");
                break;
            case 2:
                System.out.println("Insatisfeito");
                break;
            case 3:
                System.out.println("Neutro");
                break;
            case 4:
                System.out.println("Satisfeito");
                break;
            case 5:
                System.out.println("Muito satisfeito!");
                break;
            default:
                System.out.println("Isso não é uma nota válida");
                break;
        }
    }
}
