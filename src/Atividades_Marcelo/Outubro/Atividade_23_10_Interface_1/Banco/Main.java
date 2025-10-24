package Atividades_Marcelo.Outubro.Atividade_23_10_Interface_1.Banco;

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
