package Atividades_Marcelo.Outubro.Atv_Interface2.Pagamento;

public class PagamentoPix implements Pagamento{

    @Override
    public void pagar(double valor) {
        System.out.println(recibo(valor));
    }
}
