package essencial_pt1;
public class ex_aprovado_rep {
    public static void main(String[] args) {
        int nota1 = 5;
        int nota2 = 8;
        int frequencia = 70;
        if ((nota1 + nota2)/2 >= 6 && frequencia >= 75) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado :c");
        }
    }
}