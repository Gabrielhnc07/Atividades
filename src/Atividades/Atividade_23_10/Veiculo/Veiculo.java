package Atividades.Atividade_23_10.Veiculo;

public abstract class Veiculo {
    String tipo() {
        return getClass().getSimpleName();
    }

    abstract void mover();
}
