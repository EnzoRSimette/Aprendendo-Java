package pacote_exemplo;

// Sintaxe: package *nome_da_pasta*.*pastas dentro dessa maior*...;

public class Funcionario {

    /*
     ~ Para que serve?
        - Organização
        - Prevenção de conflitos de nomes
        - Reutilização de código (como uma biblioteca)
        - Controle de acesso (Você pode configurar se o pacote é publico ou não)
    */
    private String nome;
    private Double salario;

    public Funcionario(String nomeInit, Double salarioInit) {
        nome = nomeInit;
        salario = salarioInit;
    }

    public String obterInfo() { // ^ Isso é um método em java, ele ajuda a modularizar o código
                                // ^ Você pode fazer funções específicas para os objetos
        return "Nome: " + nome + ", salário: " + salario;
    }

    public void aumentarSalario(double aumento) { // ! Vale ressaltar que oq chega de fato é uma cópia do valor
        salario += aumento;                       // ! inserido, e não o valor em sí como variável, então não conseguimos
                                                  // ! modificar ele depois

    }

    //* Para passar um valor por referência, devemos usar o próprio objeto como argumento:
    public void alterarQualquerSalario(Funcionario func, double novoSalario) {
        func.salario = novoSalario; //~ Aqui ele vai salvar o salário novo no objeto
    }

    //& Em métodos, também existem sobrecargas, eles podem ter o mesmo nome e apenas com LISTAS DE PARÂMETROS DIFERENTES!
    //*  Exemplo:
    /*  CODE:
        alterarQualquerSalario(Funcionario func, double novoSalario) {
        }
        alterarQualquerSalario(Funcionario func, int percentual_salario) {
        }
    */
}
