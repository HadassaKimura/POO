package modificadores.banco;

import modificadores.cliente.Cliente;

public class Conta {

    private double saldo; // modificador de visibilidade
    private double limite;
    private Cliente cliente;



    public boolean deposito(double quantia) {
        if (quantia < 0) {
            return false;
        }
        saldo += quantia;
        return true;
    }
    public boolean sacar (double quantia) {
            if (saldo > quantia){
                saldo -= quantia;
                return false;
            }
            return true;
    }

        //Getter e Setter
        public double getSaldo() {
           return saldo;
        }
        //  public void setSaldo(double saldo) {
        //    this.saldo = saldo;
    }

