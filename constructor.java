public class constructor {
    String nome;
    String cargo;
    int idade;

    constructor(String nome, String cargo, int idade /* Argumentos... */) { // Por padrão é public, mas pode ser
                                                                            // definido como private ou protected
        this.nome = nome; // Fala assim: O valor que esse mano colocar nos argumentos (this significa a
                          // própria classe que essa coisa está, e o nome é a variável membro), eu vou
                          // colocar como nome do cara
        this.cargo = cargo;
        this.idade = idade;
    }
    // Constructor overflow: Quando há mais de um construtor na classe
    constructor() {
        //* Tipo assim, dai os construtores se diferem pela quantidade de argumentos que eles podem ter
    }

    constructor(String nome) {
        // Outro construtor
    }

    // ... Mais construtores

    public static void main(String[] args) {

        constructor funcionario1 = new constructor("Jonas", "Contador", 19); // ! Vai ser mandado para o construtor
        System.out.println(funcionario1.cargo);
        System.out.println(funcionario1.nome);
        System.out.println(funcionario1.idade);
    }
}
