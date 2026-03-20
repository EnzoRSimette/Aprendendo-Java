package mais_exercicios;

public class Ex_super {
    public static void main(String[] args) {
        Veiculo onibus = new Veiculo();
        Carro carro = new Carro();
        onibus.acelerar();
        carro.acelerar();
    }
}

class Veiculo {
    public void acelerar() {
        System.out.println("Veiculo Acelerando!");
    }
}

class Carro extends Veiculo {
    public void acelerar() {
        System.out.println("O carro está acelerando!");
        super.acelerar();
    }
}
