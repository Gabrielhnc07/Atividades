package Atividades_Marcelo.Interface.Atv_Interface2.Pagamento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface Pagamento {
    void pagar (double valor);

    default String recibo(double valor) {

        if (valor <= 0) throw
                new IllegalArgumentException("Valor deve ser Positivo!");

        String meio = getClass().getSimpleName();
        double taxa = taxaAplicada();

        if (taxa < 0 || taxa > 1) throw new IllegalArgumentException("Taxa deve estar entre 0 e 1!");

        double total = valor + valor * taxa;
        String data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        return "== Recibo ==\n" +
                "Meio: " + meio + "\n" +
                "Data: " + data + "\n" +
                "Valor: R$" + String.format("%.2f", valor) + "\n" +
                "Taxa: " + String.format("%.2f", taxa * 100) + "%\n" +
                "Total: R$" + String.format("%.2f", total);
    }

    default double taxaAplicada() {
        return 0.0;
    }
}
