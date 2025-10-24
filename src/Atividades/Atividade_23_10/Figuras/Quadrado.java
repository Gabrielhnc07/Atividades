package Atividades.Atividade_23_10.Figuras;

public class Quadrado implements FiguraG{
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
}
