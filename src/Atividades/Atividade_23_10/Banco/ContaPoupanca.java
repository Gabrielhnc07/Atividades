package Atividades.Atividade_23_10.Banco;

public class ContaPoupanca extends Conta{

    @Override
    int getTaxa() {
        return this.total;
    }
}
