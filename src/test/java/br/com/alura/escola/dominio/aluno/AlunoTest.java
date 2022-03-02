package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void beforeEach() {
        FabricaDeAluno fabricaDeAluno = new FabricaDeAluno();
        this.aluno = fabricaDeAluno.comNomeCPFEmail("William", "100.521.859-58", "williambmauro@hotmail.com").criar();
    }

    @Test
    @Order(1)
    void deveriaPermitirAdicionar1Telefone() {
        this.aluno.adicionarTelefone("48", "996822475");
        assertEquals(1, this.aluno.getTelefones().size());
    }

    @Test
    @Order(2)
    void deveriaPermitirAdicionar2Telefones() {
        this.aluno.adicionarTelefone("48", "996822475");
        this.aluno.adicionarTelefone("48", "30337442");
        assertEquals(2, this.aluno.getTelefones().size());
    }

    @Test
    @Order(3)
    void naoDeveriaAdicionarMaisQueDoisTelefones() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.aluno.adicionarTelefone("48", "996822475");
            this.aluno.adicionarTelefone("48", "30337442");
            this.aluno.adicionarTelefone("48", "999657569");
        });
    }
}