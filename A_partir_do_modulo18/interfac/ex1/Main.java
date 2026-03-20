package interfac.ex1;

interface Veiculo {
    void iniciar();
    default void buzinhar() {
        System.out.println("BEEP BEEEPPPP!!!");
    }
    void parar();
}

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Caminhao caminhao2 = new Caminhao();
        carro1.iniciar();
        carro1.buzinhar();
        carro1.parar();
        caminhao2.iniciar();
        caminhao2.parar();
        caminhao2.buzinhar();
        System.out.println("Os dois veiculos QUASE colidiram!");
    }
}

class Carro implements Veiculo {
    public void iniciar() {
        System.out.println("O carro está iniciando...");
    }

    public void parar() {
        System.out.println("O carro está parando...");
    }
}

class Caminhao implements Veiculo {
    public void iniciar() {
        System.out.println("O caminhão está iniciando...");
    }
    public void parar() {
        System.out.println("O caminhão está parando...");
    }
}
