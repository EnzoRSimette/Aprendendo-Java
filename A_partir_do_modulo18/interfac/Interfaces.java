package interfac;

//~ Para criar, usamos a palavra interface

public class Interfaces {
    public static void main(String[] args) {
        MinhaClasse classe1 = new MinhaClasse();
        MinhaClasse2 classe2 = new MinhaClasse2();
        classe1.escreverHello();
        classe2.escreverHello();
    }

}


interface interfaces { // É um guia de todas as funcionalidades a serem implementadas

    // Métodos e constantes...
    void escreverHello(); //? Não pode ter corpo
    //^ Método abstrato

}

//~ Para implementar a interface, utilizamos implements

class MinhaClasse implements interfaces {

    // implementação dos métodos...
    public void escreverHello() {
        System.out.println("Hello"); // Implementação do método
    }
}

class MinhaClasse2 implements interfaces {

    public void escreverHello() {
        System.out.println("Essa é a classe dois");
    }

}