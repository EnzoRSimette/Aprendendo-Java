package essencial_pt1;
public class Heranca {
    /*
     * extends para criar uma subclasse
     * ! É usado o princípio de [é um] para criar uma subclasse
     */
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.latir();
        dog.comer(); // * Só consegue por que herda as funções da super classe / classe pai
    }
}

class Animal {
    public void comer() {
        System.out.println("Comeu");
    }
}

class Cachorro extends Animal {
    public void latir() {
        System.out.println("Latiu");
        //! A palavra super.** se refere a superclasse imediata, exemplo
        super.comer(); // Isso aqui vai imprimir comer quando eu usar latir
    }

    //^ Method Overriding -> Diz que se existem funções iguais, então a função
    //^ Filha deve ser priorizada e reescrever a função pai
    //~ Nesse exemplo, se chamarmos Cachorro.comer() ele vai exibir "O cachorro comeu"
    //~ E não só comeu como se fosse sem reescrever
    public void comer() { //* Para acontecer o overriding, as funções precisam ser IGUAIS
        System.out.println("O cachorro comeu");
    }
}
