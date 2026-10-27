package padroescomportamentais.mediator;

public class Recepcionista implements Setor {

    private static Recepcionista instancia = new Recepcionista();

    private Recepcionista() {}

    public static Recepcionista getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Recepção vai procurar melhorar o atendimento referente à reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Recepção agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Recepção vai analisar a sugestão: " + mensagem;
    }
}