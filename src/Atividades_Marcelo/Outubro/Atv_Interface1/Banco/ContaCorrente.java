package Atividades_Marcelo.Outubro.Atv_Interface1.Banco;

public class ContaCorrente extends Conta{

    @Override
    int getTaxa() {
        return this.total * 2;
    }
}
