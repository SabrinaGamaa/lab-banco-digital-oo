import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        Cliente cliente = new Cliente(nome);

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(1000);
        cc.sacar(100);

        cc.printInfoConta("---- Extrato da Conta Corrente ---- ");

        System.out.println();

        poupanca.depositar(15000);

        poupanca.printInfoConta("=-=- Extrato da Conta Poupança -=-=");


    }
}
