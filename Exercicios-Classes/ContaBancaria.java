public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Não foi possivel realizar o saque, pois nao ha fundos suficiente");
        }
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(12345, "André Meneses", 5000.0);

        System.out.println("Informações da Conta Bancária:");
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: R$" + conta.getSaldo());

        conta.depositar(500.0);
        conta.sacar(300.0);
        conta.sacar(7000.0);

        System.out.println("Informações atualizadas da Conta Bancária:");
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: R$" + conta.getSaldo());
    }
}
