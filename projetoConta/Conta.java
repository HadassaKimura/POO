package projetoConta;

public class Conta {
    int numero;
    float saldo;
    float limite;
    Cliente cliente;

    void deposita(float quantia){
        //como que ela faz?
        saldo += quantia;
    }

    void saca(float quantia){

        saldo-= quantia;
    }
    void transfere(Conta contaDestino, float quantia){
        saldo-=quantia;
        contaDestino.saldo+= quantia;
    }
}
