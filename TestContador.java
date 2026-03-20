class MembrosStaticos {
    //~ =====================
    //~ = Membros Estáticos =
    //~ =====================

    static int contagem = 0;

    public MembrosStaticos() {
        contagem++;
    }

}

public class TestContador {
    public static void main(String[] args) {
        MembrosStaticos c1 = new MembrosStaticos();
        MembrosStaticos c2 = new MembrosStaticos();
        System.out.println("Número de contadores: " + MembrosStaticos.contagem);
        MembrosStaticos c3 = new MembrosStaticos();
        System.out.println("Número de contadores: " + MembrosStaticos.contagem);
    }
}
