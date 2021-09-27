public class Principal {

    public static void main(String[] args) {
        int x1[] = new int[5];

 //       for (int x : x1) {
 //           System.out.println("Quanto vale x1: " + x1);
//            for(int x :x1){
//                System.out.println(x);

        Zumbi zumbis[] = new Zumbi[]; //Criou uma área de 5 zumbis, um vetor de 5 espaços

        Zumbi z1 = new Zumbi(200,"Trevoso"); //Agora criou um zumbi
        zumbis[0] = z1; // o zumbi z1 está no primeiro lugar do vetor

       System.out.println("Quanto vale zumbis: " + zumbis);
        for(Zumbi zumbi : zumbis){
            System.out.println(zumbi.getVida());
            }
        }
    }

