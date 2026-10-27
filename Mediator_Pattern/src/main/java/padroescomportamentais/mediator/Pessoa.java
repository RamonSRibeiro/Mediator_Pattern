package padroescomportamentais.mediator;

public class Pessoa {

    public String elogiarRecepcionista(String mensagem) {
        return Atendimento.getInstancia().receberElogioRecepcionista(mensagem);
    }

    public String reclamarRecepcionista(String mensagem) {
        return Atendimento.getInstancia().receberReclamacaoRecepcionista(mensagem);
    }

    public String sugerirRecepcionista(String mensagem) {
        return Atendimento.getInstancia().receberSugestaoRecepcionista(mensagem);
    }


}