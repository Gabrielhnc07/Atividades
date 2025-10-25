package Atividades_Marcelo.Interface.Atv_Interface1.Figuras;

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
