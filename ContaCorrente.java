public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void printExtrato(){
        String msg = "=-=- Extrato Conta Corrente -=-=";
        super.printInfoConta(msg);
    }
}
