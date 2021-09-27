package inimigo;

public class CavNegro extends Inimigo {
    public CavNegro(double vida, String nome) {
        super(vida, nome);
    }

    @Override
    public void atacando(){
        System.out.println("Cavaleiro Negro: " + this.nome + " está atacando!");
    }
}
