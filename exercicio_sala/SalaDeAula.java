package exercicio_sala;
public class SalaDeAula {
    static int total_alunos;
    public static void SaladeAula() {
        total_alunos++;
    }
    public static void exibir_alunos() {
        System.out.println(SalaDeAula.total_alunos);
    }
}
