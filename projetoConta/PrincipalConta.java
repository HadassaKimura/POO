package projetoConta;

public class PrincipalConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 200;
        conta.limite =100;
        conta.numero = 123;

        Cliente cliente = new Cliente();
        cliente.nome = "Demonia";
        cliente.idade = 28;
        cliente.cpf = "123.456.789.00";

        conta.cliente = cliente; //A demonia tem referências da conta e do cliente.

        System.out.println("Nome do cliente: " +conta.cliente.nome); // Variavel da classe conta
        System.out.println("Nome do cliente: " + cliente.nome);   // Variável da classe cliente
        //A classe cliente está dentro da classe conta
    }
}
