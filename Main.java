public class Main {
    public static void main(String[] args) {



        var cliente1 = new Cliente("Gabriel Feitosa");
        var cliente2 = new Cliente("Daniel Marcelo da Silva");
        var cliente3 = new Cliente("Julia Silva");


        var contaCorrente1 = new ContaCorrente(cliente1);
        var contaPoupanca2 = new ContaPoupanca(cliente2);
        var contaPoupanca3 = new ContaPoupanca(cliente3);

        contaCorrente1.imprimirExtrato();
        contaPoupanca2.imprimirExtrato();
        contaPoupanca3.imprimirExtrato();

        contaCorrente1.depositar(50);
        contaPoupanca2.depositar(100);

        contaCorrente1.imprimirExtrato();
        contaPoupanca2.imprimirExtrato();

        contaPoupanca2.transferir(50, contaCorrente1);

        contaCorrente1.imprimirExtrato();
        contaPoupanca2.imprimirExtrato();
    }
}
