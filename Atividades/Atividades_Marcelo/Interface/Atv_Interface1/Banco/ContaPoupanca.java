package Atividades_Marcelo.Interface.Atv_Interface1.Banco;

public class ContaPoupanca extends Conta{

    @Override
    int getTaxa() {
        return this.total;
    }
}
