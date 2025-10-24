package Atividades_Marcelo.Outubro.Atividade_24_10_Interface_2.Email;

public class RelatorioEstoque implements Exportavel{
    @Override
    public String exportar() {
        return cabecalho() + "ESTOQUE\nPRODUTO / QUANTIDADE / PREÇO\nCamisa / 27 / R$1228,50\nBola / 51 / R$459,00";
    }
}
