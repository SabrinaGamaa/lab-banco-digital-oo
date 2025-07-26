public abstract class Conta {
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;
    private static int num = 1;

    protected Conta() {
    }

    public Conta(Cliente cliente) {

        this.agencia = 1;
        this.numero = num++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        if (valor >= getSaldo()) {
            System.out.println("Saldo Insuficiente!!!");
        } else {
            saldo -= valor;
        }
    }

    public void depositar(double valor) {
        saldo += valor;

    }

    public void transferencia(double valor, Conta destino) {
        if (this.getSaldo() >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo Insuficiente para realizar essa transferencia");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    protected void printInfoConta(String msg) {
        System.out.println(msg);
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Conta: " + getNumero());
        System.out.printf("Saldo: R$ %.2f \n", getSaldo());

    }
}
