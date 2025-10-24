package Atividades_Marcelo.Outubro.Atividade_23_10_Interface_1.Banco;

public abstract class Conta {
    protected int total = 100;

    public void mostrarValor() {
        System.out.println("Total: R$" + total);
    }

    abstract int getTaxa();
}
