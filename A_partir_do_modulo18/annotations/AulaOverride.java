package annotations;
public class AulaOverride {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.fazerSom();
    }
}

class Animal {
    public void fazerSom() {
        System.out.println("O animal fez um som!");
    }
}

class Cachorro extends Animal {

    @Override // Atenção, está avisando que a função está sofrendo override
    //^ Usar java annotations é considerado boa prática

    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}
