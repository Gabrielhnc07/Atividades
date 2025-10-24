package Atividades_Marcelo.Outubro.Atv_Interface2.Email;

public interface Exportavel {
    String exportar();

    default String cabecalho() {
        return "---EXPORT---\n";
    }
}
