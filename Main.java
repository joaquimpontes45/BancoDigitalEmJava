public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Kallistor");
        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente1);

        contaCorrente.depositar(1000);
        contaCorrente.transferir(250, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
