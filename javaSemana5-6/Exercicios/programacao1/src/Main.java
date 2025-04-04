public class Main {
    public static void main(String[] args) {
        class ContaCorrente {
            int numeroConta;
            double saldoAtual;

            public ContaCorrente(int numeroConta, double saldoAtual) {
                this.numeroConta = numeroConta;
                this.saldoAtual = saldoAtual;
            }
        }
        ContaCorrente Conta1 = new ContaCorrente(1234, 100.00);
        ContaCorrente Conta2 = new ContaCorrente(8765, -98.00);
        ContaCorrente Conta3 = new ContaCorrente(3342, 3445.80);

        System.out.println(Conta1.numeroConta);
        System.out.println(Conta2.numeroConta);
        System.out.println(Conta3.numeroConta);
    }
}