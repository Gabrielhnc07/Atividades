package Banco;

public class ContaPoupanca extends Conta{

    @Override
    int getTaxa() {
        return this.total;
    }
}
