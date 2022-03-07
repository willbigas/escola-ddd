package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;
import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatriculadorDeAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        PublicadorDeEventos publicador = new PublicadorDeEventos();
        publicador.adicionar(new LogDeAlunoMatriculado());

        MatriculadorDeAluno matriculador = new MatriculadorDeAluno(repositorio, publicador);

        DadosDoAlunoDTO dados = new DadosDoAlunoDTO(
                "Fulano"
                , "123.456.789-00"
                , "fulano@email.com");
        matriculador.matricular(dados);

        Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));

        assertEquals("Fulano" , encontrado.getNome());
        assertEquals("123.456.789-00" , encontrado.getCpf().getNumero());
        assertEquals("fulano@email.com" , encontrado.getEmail().getEndereco());

    }

}