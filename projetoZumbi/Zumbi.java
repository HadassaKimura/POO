package projetoZumbi;

public class Zumbi {

    // O que ProjetoZumbi.Zumbi sabe sobre si?
    String nome;
    double vida;

    //O que o zumbi sabe fazer?
    String falar(){
        return "Estou com fome!!!";
    }
    void alimentar(){
        // vida= vida+1
        vida++;
    }
    //O que faz?
    boolean transferirVida(double qtdVida, Zumbi outroZumbi) {
        //como faz?
        if (vida > qtdVida) {
            vida -= qtdVida; //decrementou a vida de quem invocar a função
            outroZumbi.vida += qtdVida; //incrementou a vida do outroZumbi
             return true;
        }else{
            return false;
        }
    }
}
