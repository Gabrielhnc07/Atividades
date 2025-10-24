package Atividades_Marcelo.Outubro.Atividade_23_10_Interface_1.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo c = new Carro();
        Veiculo b = new Bicicleta();

        System.out.println(c.tipo());
        c.mover();

        System.out.println(b.tipo());
        b.mover();
    }
}