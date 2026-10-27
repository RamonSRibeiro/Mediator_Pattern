package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {

    @Test
    void deveElogiarRecepcionista() {
        Paciente paciente = new Paciente();
        assertEquals("A Clínica agradece seu contato.\nA Recepção respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Recepção agradece a mensagem: Ótimo atendimento",
                paciente.elogiarRecepcionista("Ótimo atendimento"));
    }

    @Test
    void deveReclamarRecepcionista() {
        Paciente paciente = new Paciente();
        assertEquals("A Clínica agradece seu contato.\nA Recepção respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Recepção vai procurar melhorar o atendimento referente à reclamação: Lentidão no atendimento",
                paciente.reclamarRecepcionista("Lentidão no atendimento"));
    }

    @Test
    void deveSugerirRecepcionista() {
        Paciente paciente = new Paciente();
        assertEquals("A Clínica agradece seu contato.\nA Recepção respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Recepção vai analisar a sugestão: Ampliar horário de funcionamento",
                paciente.sugerirRecepcionista("Ampliar horário de funcionamento"));
    }

}