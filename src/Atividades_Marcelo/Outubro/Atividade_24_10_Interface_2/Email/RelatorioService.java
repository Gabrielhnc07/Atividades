package Atividades_Marcelo.Outubro.Atividade_24_10_Interface_2.Email;

public class RelatorioService {
    protected Notificador notificador;
    protected Exportavel exportavel;

    public RelatorioService(Notificador notificador, Exportavel exportavel) {
        this.notificador = notificador;
        this.exportavel = exportavel;
    }

    public void gerarEenviar(String destino) {
        String conteudo = exportavel.exportar();
        notificador.enviar(destino, conteudo);
    }
}
