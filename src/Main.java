import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Meu Banco");

        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        cc.depositar(new BigDecimal("100"));
        cc.transferir(new BigDecimal("100"), poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
