package Atividades.Atividade_23_10.Banco;

public class ContaCorrente extends Conta{

    @Override
    int getTaxa() {
        return this.total * 2;
    }
}
