package Atividades.Atividade_23_10.Animal;

public class Animal implements SerVivo{
    public boolean vivo = true;

    public Animal(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public void mover() {
        System.out.println("Movendo!");
    }

    @Override
    public void comer() {
        System.out.println("Comendo!");
    }

    @Override
    public void info() {
        System.out.println("Animal doido!");
        System.out.println("Vivo?" + vivo);
    }
}
