package modificadores.cliente;

public class Cliente {
    String nome;
    int idade;

    public Cliente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }
    //Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
