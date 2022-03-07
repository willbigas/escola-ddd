import br.com.alura.escola.academico.dominio.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void naoDeveriaCriarCpfsInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new CPF("00000000000"));
        assertThrows(IllegalArgumentException.class, () -> new CPF("99999999999"));
        assertThrows(IllegalArgumentException.class, () -> new CPF("12345678910"));
    }

    @Test
    void deveriaCriarCpfsValidos() {
        CPF cpfUm = new CPF("100.521-859-58");
        assertNotNull(cpfUm);

        CPF cpfDois = new CPF("853.267.399-68");
        assertNotNull(cpfDois);
    }

}