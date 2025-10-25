package Atividades_Marcelo.Interface.Atv_Interface2.Pagamento;

public class PagamentoPix implements Pagamento{

    @Override
    public void pagar(double valor) {
        System.out.println(recibo(valor));
    }
}
