package Atividades_Marcelo.Outubro.Atividade_24_10_Interface_2.Email;

public class AppRelatorioService {
    public static void main(String[] args) {
        RelatorioService service1 = new RelatorioService(new EmailNotificador(), new RelatorioVendas());
        service1.gerarEenviar("user@email.com");

        System.out.println("\n-------------------------\n");

        RelatorioService service2 = new RelatorioService(new SmsNotificador(), new RelatorioEstoque());
        service2.gerarEenviar("43 99999-9999");
    }
}
