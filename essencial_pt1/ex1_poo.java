package essencial_pt1;
public class ex1_poo {
    String nome = "Esse funcionário não existe";
    String cargo = "Esse funcionário não existe ou cargo indefinido";
    int idade;

    public static void main(String[] args) {
        ex1_poo funcionario1 = new ex1_poo();
        funcionario1.nome = "Roberto";
        funcionario1.cargo = "Financeiro";
        funcionario1.idade = 19;
        System.out.println("O funcionário em questão tem o nome: " + funcionario1.nome + ", ele está no cargo: "
                + funcionario1.cargo + ", e tem " + funcionario1.idade + " anos.");
    }
}
