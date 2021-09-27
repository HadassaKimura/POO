package marioKart;

public class Principal {
    public static void main(String[] args) {
        Kart kart1= new Kart();
        kart1.nome= "Celtinha";
        kart1.motor.velocidadeMaxima = 120;
        kart1.motor.cilindradas= "150";

        Piloto piloto1 = new Piloto();
        piloto1.nome = "MUAHAHHA";
        piloto1.vilao = true;

        Kart kart2= new Kart();
        kart2.nome = "Celta preto";
        kart2.motor.velocidadeMaxima = 150;
        kart2.motor.cilindradas= "100";

        Piloto piloto2 = new Piloto();
        piloto2.nome = "Capiroto";
        piloto2.vilao = true;

        kart1.piloto= piloto1;
        kart1.piloto.nome = ("Dikî vigarista !!!");
        System.out.println("Nome do piloto1: " + piloto1.nome);

        kart2.piloto= piloto2;
        kart2.piloto.nome = ("Lucifer !!!");
        System.out.println("Nome do piloto2: " + piloto2.nome);


        System.out.println("Parabens. Voce chegou aqui");
    }
}
