package marioKart;

public class Motor {
    // o que ele sabe?
    String cilindradas;
    float velocidadeMaxima;

    // o que ele faz?
    void mostrarInfo(){
        System.out.println("Mostrando informações do motor");
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima);
    }
}
