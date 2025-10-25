package Atividades_Marcelo.Interface.Atv_Interface2.Email;

public interface Exportavel {
    String exportar();

    default String cabecalho() {
        return "---EXPORT---\n";
    }
}
