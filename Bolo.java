public class Bolo {
    //& Objetos são como bolos recém assados, sem recheio, cobertura, nada
    //* A classe é como uma receita para criar um bolo,
    //* é um conjunto de instruções para criar o obejeto
    //! Cada bolo pode possuir ingredientes diferentes, isso é chamado de variável de instância
    int quantidadeAcucar; // Var de instância
    public static void main(String[] args) {
        Bolo boloDeChocolate = new Bolo(); //^ ISSO CRIA O OBJETO (boloDeChocolate) DENTRO DA CLASSE BOLO
        boloDeChocolate.quantidadeAcucar = 200; //? Está falando assim: dentro do objeto boloDeChocolate tem a propriedade açucar, eu quero ela como 200
        Bolo boloBaunilha = new Bolo();
        boloBaunilha.quantidadeAcucar = 150;
        System.out.println(boloDeChocolate.quantidadeAcucar /* OBJETO.PROPRIEDADE */ + " " + boloBaunilha.quantidadeAcucar);
    }
}
