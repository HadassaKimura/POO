package projetoZumbi;

import java.util.Locale;

public class PrincipalZumbi {

    public static void main(String[] args) {

       Locale.setDefault(new Locale("pt","BR"));

        Zumbi z;
        Zumbi zumbi1= new Zumbi(); //Construtor. Criação do zumbi1.
        zumbi1.vida =100;
        zumbi1.nome= "Capirota";
        //System.out.println(zumbi1.falar());

        Zumbi zumbi2= new Zumbi();
        zumbi2.vida= 40;
        zumbi2.nome= "Capiroto";

        System.out.println("Vida do zumbi1: " + zumbi1.vida + " Vida do zumbi3: " +zumbi2.vida);
        int valor =150;

        zumbi1.transferirVida(valor, zumbi2);
        System.out.println("Vida do zumbi1: " +zumbi1.vida + "Vida do zumbi2: " +zumbi2.vida);

        }

        //System.out.println( zumbi1 + "só pra ficar bonito"+ zumbi2 );
        //zumbi1=zumbi2; //agora zumbi1 tem a mesma referencia que zumbi2
        //zumbi1.vida= 100; //por isso, zumbi2 tem saída == 100

        //System.out.println(zumbi2.vida);
    }

//int x = 10;
//double y = 3.4;
//float j = 0.1f;
// char c = 'a';
//boolean h = false;
// System.out.println(zumbi1.vida);
 // System.out.println(zumbi2.vida);