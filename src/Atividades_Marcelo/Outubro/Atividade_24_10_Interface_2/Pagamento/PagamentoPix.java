package Atividades_Marcelo.Outubro.Atividade_24_10_Interface_2.Pagamento;

public class PagamentoPix implements Pagamento{

    @Override
    public void pagar(double valor) {
        System.out.println(recibo(valor));
    }
}
