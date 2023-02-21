public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.saldo = 50;
    }

    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor - 1);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("======= Extrato Conta Poupança =======");
        super.imprimirInfosComuns();

    }
}