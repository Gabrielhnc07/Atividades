package Atividades_Marcelo.Outubro.Atividade_23_10_Interface_1.Banco;

public class ContaPoupanca extends Conta{

    @Override
    int getTaxa() {
        return this.total;
    }
}
