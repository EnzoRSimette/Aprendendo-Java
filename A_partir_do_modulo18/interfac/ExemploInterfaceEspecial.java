package interfac;

interface ExemploInterfaceEspecial {
    // ^ Abaixo estão os 3 tipos de métodos dentro de interfaces
    void metodoAbstrato(); // Método abstrato, apenas o protótipo do método

    default void metodoDefault() {
        System.out.println("Esse é um exemplo de método DEFAULT");
    }

    static void metodoStatic() {
        System.out.println("Esse é um exemplo de método STATIC");
    }

}

class ExemploClasse implements ExemploInterfaceEspecial {
    public void metodoAbstrato() {
        System.out.println("Implementação do método ABSTRATO");
    }

    public static void main(String[] args) {
        ExemploClasse exemplo = new ExemploClasse();
        exemplo.metodoAbstrato();
        exemplo.metodoDefault(); // Chama diretamente da interface
        ExemploInterfaceEspecial.metodoStatic(); // Chama diretamente da interface como se fosse chamar de uma classe
                                                 // STATIC
    }
}
