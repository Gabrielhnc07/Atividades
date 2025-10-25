package Atividades_Marcelo.Interface.Atv_Interface1.Veiculo;

public abstract class Veiculo {
    String tipo() {
        return getClass().getSimpleName();
    }

    abstract void mover();
}
