package marioKart;

public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;

    public Kart(){
        motor = new Motor();
        piloto = new Piloto();
    }
    // O que ele pode fazer?
    void pular(){
        System.out.println("Kart" + nome + "pulando!");
    }

    void soltaTurbo(){
        System.out.println("Kart" +  nome + "Soltando turbo");
    }
    void fazDrift() {
        System.out.println("Kart" + nome + "Fazendo drift");

    }
}
