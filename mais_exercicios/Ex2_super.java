package mais_exercicios;

public class Ex2_super {
    public static void main(String[] args) {
        Assistente ass1 = new Assistente("João", 3000);
        ass1.exibirSalario();
        ass1.addAumento(500);
        ass1.exibirSalario();
        ass1.exibirSalarioAnual();
    }
}

class Funcionario {
    private String nome;
    private double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double addAumento(double valor) {
        this.salario = this.salario + valor; //* this serve para desambiguar as variáveis
        return this.salario;
    }

    public double ganhoAnual() {
        double salAnual = this.salario*12;
        return salAnual;
    }

    public void exibirSalario() {
        System.out.println("O funcionário " + this.nome + " possui como salário: " + this.salario);
    }

    public void exibirSalarioAnual() {
        System.out.println("O salário anual do funcionario " + this.nome + " é: " + ganhoAnual());
    }

    public String exibirNome() {
        return this.nome;
    }

    public double setarSalario(double salarioInit) {
        this.salario = salarioInit;
        System.out.println("Novo salário: " + this.salario);
        return this.salario;
    }
}

class Assistente extends Funcionario {
    Assistente(String nome, double salario) {
        super(nome, salario); //! super -> Literalmente é o nome da classe, use como se fosse
    }
    public double ganhoAnual() {
        double salAnual = super.ganhoAnual() + 1000;
        return salAnual;
    }
    public void exibirSalarioAnual() {
        System.out.println("O salário anual do funcionario " + super.exibirNome() + " é: " + ganhoAnual());
    }
}