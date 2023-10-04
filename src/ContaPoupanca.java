public class ContaPoupanca extends ContaBancaria {

    private int numeroConta;
    private int cpfCliente;
    private Double saldo;

    public ContaPoupanca(int numeroConta, int cpfCliente, Double saldo) {
        this.numeroConta = numeroConta;
        this.cpfCliente = cpfCliente;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getCpfCliente() {
        return cpfCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setCpfCliente(int cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) {
        if (valor > this.saldo){
            System.out.println("Valor da conta é inferior ao saque!");
        } else {
            System.out.println("Saque aprovado!");
            this.saldo = this.saldo - valor;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }
}
