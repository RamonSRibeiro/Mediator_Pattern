package padroescomportamentais.mediator;

public class Atendimento {

    private static Atendimento instancia = new Atendimento();

    private Atendimento() {}

    public static Atendimento getInstancia() {
        return instancia;
    }

    public String receberElogioRecepcionista(String mensagem) {
        return "A Clínica agradece seu contato.\n"+
                "A Recepção respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Recepcionista.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoRecepcionista(String mensagem) {
        return "A Clínica agradece seu contato.\n"+
                "A Recepção respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Recepcionista.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoRecepcionista(String mensagem) {
        return "A Clínica agradece seu contato.\n"+
                "A Recepção respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Recepcionista.getInstancia().receberSugestao(mensagem);
    }

}