import br.com.alura.escola.academico.dominio.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));

        assertThrows(IllegalArgumentException.class, () -> new Email(""));

        assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));
    }

    @Test
    void deveriaCriarEmailsComEnderecosValidos() {
        Email email1 = new Email("will.bigas@gmail.com");
        assertNotNull(email1);

        Email email2 = new Email("williambmauro@hotmail.com");
        assertNotNull(email2);
    }

}