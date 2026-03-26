package abstracao;

public class abstration {
    //^ Abstração significa o que vem antes de uma classe extendida
    //~ O contrário é especificando
    /*
    * Ex: Todo cachorro é um -> Animal, todo animal é um -> Ser vivo
    */

    public static void main(String[] args) {
        CarroF1 carrof1 = new CarroF1();
        Caminhao caminhaum = new Caminhao();
        carrof1.acelerar();
        caminhaum.acelerar();
        carrof1.frear();
        caminhaum.frear();
    }
}

// Se assemelha muito a interfaces
abstract class Carro { // Está dizendo que esse é o "conceito maior"
                       // Portanto, tudo que extenda carro, precisa ter acelerar
    abstract void acelerar();
    void frear() {
        System.out.println("Freou");
    }
}

class CarroF1 extends Carro {
    void acelerar() {
        System.out.println("Está acelerando");
    }
}

class Caminhao extends Carro {
    void acelerar() {
        System.out.println("O caminhão está acelerando devagar");
    }
}

/*
^ Regras de classes abstratas:
    !1. Não podem ser instânciadas
    ?2. Podem conter métodos abstratos e não-abstratos
    *3. Podem conter construtores -> Nesse caso, deve-se usar SUPER
    ~4. Podem conter campos
    &5. Podem implementar interfaces
*/

/*
^ Diferença entre abstract e interface
    - Estado do objeto
    - Construtores
    - Herança múltipla e implementações múltiplas
    - Métodos de implementação
*/