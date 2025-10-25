package Atividades_Marcelo.Interface.Atv_Interface2.Email;

public class EmailNotificador implements Notificador{

    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Enviando EMAIL para " + destino + "\n" + mensagem);
    }
}
