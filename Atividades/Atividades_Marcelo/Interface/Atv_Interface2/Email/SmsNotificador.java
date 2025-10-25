package Atividades_Marcelo.Interface.Atv_Interface2.Email;

public class SmsNotificador implements Notificador{

    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Enviando SMS para " + destino + "\n" + mensagem);
    }
}
