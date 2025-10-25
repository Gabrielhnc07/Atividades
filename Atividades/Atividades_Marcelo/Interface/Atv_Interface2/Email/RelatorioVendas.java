package Atividades_Marcelo.Interface.Atv_Interface2.Email;

public class RelatorioVendas implements Exportavel{
    @Override
    public String exportar() {
        return cabecalho() + "VENDAS\nPRODUTO / QUANTIDADE / VALOR\nCamisa / 5 / R$45,50\nBola / 3 / R$9,00";
    }
}
