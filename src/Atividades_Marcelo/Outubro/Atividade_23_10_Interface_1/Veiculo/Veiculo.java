package Atividades_Marcelo.Outubro.Atividade_23_10_Interface_1.Veiculo;

public abstract class Veiculo {
    String tipo() {
        return getClass().getSimpleName();
    }

    abstract void mover();
}
