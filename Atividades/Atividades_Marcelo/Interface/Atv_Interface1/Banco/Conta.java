package Atividades_Marcelo.Interface.Atv_Interface1.Banco;

public abstract class Conta {
    protected int total = 100;

    public void mostrarValor() {
        System.out.println("Total: R$" + total);
    }

    abstract int getTaxa();
}
