

public class Pessoa {
    public String nome;
    private int idade;
    protected String endereco;
    int telefone;

    public int getIdade() {
        return this.idade;
    }
    public String getEndereco() {
        return this.endereco;
    }
    public String getNome() {
        return this.nome;
    }
    public int getTelefone() {
        return this.telefone;
    }
    public int setIdade(int idadeInit) {
        this.idade = idadeInit;
        return this.idade;
    }
    public String setEndereco(String enderecoInit) {
        this.endereco = enderecoInit;
        return this.endereco;
    }
    public String setNome(String nomeInit) {
        this.nome = nomeInit;
        return this.nome;
    }
    public int setTelefone(int telefoneInit) {
        this.telefone = telefoneInit;
        return this.telefone;
    }
}
