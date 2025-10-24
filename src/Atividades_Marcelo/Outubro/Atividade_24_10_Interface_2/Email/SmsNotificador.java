package Atividades_Marcelo.Outubro.Atividade_24_10_Interface_2.Email;

public class SmsNotificador implements Notificador{

    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Enviando SMS para " + destino + "\n" + mensagem);
    }
}
