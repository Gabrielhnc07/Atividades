package Atividades_Marcelo.Outubro.Atividade_24_10_Interface_2.Email;

public interface Exportavel {
    String exportar();

    default String cabecalho() {
        return "---EXPORT---\n";
    }
}
