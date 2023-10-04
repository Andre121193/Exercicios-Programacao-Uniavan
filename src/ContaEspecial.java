public class ContaEspecial extends ContaBancaria{

    private int numeroConta;
    private int cpfCliente;
    private Double saldo;

    public ContaEspecial(int numeroConta, int cpfCliente, Double saldo) {
        this.numeroConta = numeroConta;
        this.cpfCliente = cpfCliente;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(int cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) {
        if (valor > this.saldo){
            System.out.println("Valor da conta é inferior ao saque! taxa de 5% sera cobrada.");
            this.saldo = this.saldo - valor;
            this.saldo = 1.05 * this.saldo;
        } else {
            System.out.println("Saque aprovado!");
            this.saldo = this.saldo - valor;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
}
