public class TesteConta {

    public static void main(String[] args) {

    ContaPoupanca cp = new ContaPoupanca(11222, 12345688, 150.00);
    ContaEspecial ce = new ContaEspecial(11333, 12345688, 200.00);

    System.out.println("ContaPoupanca ");
    System.out.println("valor em conta: " + cp.getSaldo());
    cp.sacar(20);
    System.out.println("valor em conta: " + cp.getSaldo());
    cp.sacar(1000);
    System.out.println("valor em conta: " + cp.getSaldo());
    cp.depositar(100);
    System.out.println("valor em conta: " + cp.getSaldo());

    System.out.println("ContaEspecial ");
    System.out.println("valor em conta: " + ce.getSaldo());
    ce.sacar(20);
    System.out.println("valor em conta: " + ce.getSaldo());
    ce.sacar(1000);
    System.out.println("valor em conta: " + ce.getSaldo());
    ce.depositar(100);
    System.out.println("valor em conta: " + ce.getSaldo());





    }
}
