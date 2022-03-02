package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.PublicadorDeEventos;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoMatriculado;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class MatriculadorDeAluno {

    private final RepositorioDeAlunos repositorio;
    private final PublicadorDeEventos publicador;

    public MatriculadorDeAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicador) {
        this.repositorio = repositorio;
        this.publicador = publicador;
    }

    public void matricular(DadosDoAlunoDTO dados) {
        Aluno novo = dados.criarAluno();
        repositorio.matricular(novo);
        publicador.publicar(new AlunoMatriculado(novo.getCpf()));
    }
}
