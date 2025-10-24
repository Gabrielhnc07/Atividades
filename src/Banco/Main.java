package Banco;

public class Main {
    public static void main(String[] args) {
        Conta c;

        c = new ContaCorrente();
        c.mostrarValor();
        System.out.println(c.getTaxa());

        c = new ContaPoupanca();
        c.mostrarValor();
        System.out.println(c.getTaxa());
    }
}
