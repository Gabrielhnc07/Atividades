package Atividades_Marcelo.Outubro.Atividade_24_10_Interface_2.Pagamento;

public class Main {
    public static void main(String[] args) {

        Pagamento cartao = new PagamentoCartao(0.03);
        cartao.pagar(10000);

        System.out.println("-----------");

        Pagamento pix = new PagamentoPix();
        pix.pagar(50);
    }
}
