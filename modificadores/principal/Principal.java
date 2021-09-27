package modificadores.principal;

import modificadores.banco.Conta;
import modificadores.cliente.Cliente;
public class Principal {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposito(1000);

        Cliente cliente = new Cliente("Capirota", 666);

    }
}
