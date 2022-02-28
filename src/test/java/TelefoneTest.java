import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefonesComMaisDigitosDoQueOPermitido() {
        assertThrows(IllegalArgumentException.class , () -> new Telefone("048", "30337442048"));
    }

    @Test
    void deveriaCriarTelefonesComAQuantidadeDeDigitosCorreta() {
        Telefone telefoneUm = new Telefone("48" , "30337442");
        Telefone telefoneDois = new Telefone("48" , "996822475");
        assertNotNull(telefoneUm);
        assertNotNull(telefoneDois);
    }

}