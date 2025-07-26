public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void printExtrato() {
        String msg = " ---- Extrato Conta Poupança ----";
        super.printInfoConta(msg);
    }
}
