import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefonesComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "123456789"));

        assertThrows(IllegalArgumentException.class, () -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "123456789"));
    }

    @Test
    void naoDeveriaCriarTelefonesComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone("48", null));

        assertThrows(IllegalArgumentException.class, () -> new Telefone("48", ""));

        assertThrows(IllegalArgumentException.class, () -> new Telefone("48", "123"));

    }

    @Test
    void naoDeveriaCriarTelefonesComMaisDigitosDoQueOPermitido() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone("048", "30337442048"));
    }

    @Test
    void deveriaCriarTelefonesComAQuantidadeDeDigitosCorreta() {
        Telefone telefoneUm = new Telefone("48", "30337442");
        Telefone telefoneDois = new Telefone("48", "996822475");
        assertNotNull(telefoneUm);
        assertNotNull(telefoneDois);
    }

}