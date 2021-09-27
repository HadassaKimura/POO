package inimigo;

public class ZumbiLerdo extends Inimigo {

    public ZumbiLerdo(double vida, String nome) {
        super(vida, nome);
    }
    @Override  // mesma assinatura que está na mãe
    public void atacando(){
      System.out.println("ZumbiLerdo: " + this.nome + " está atacando!");
   }
}

