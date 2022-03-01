package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class MatriculadorDeAluno {

    private final RepositorioDeAlunos repositorio;

    public MatriculadorDeAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    public void matricular(DadosDoAlunoDTO dados) {
        Aluno novo = dados.criarAluno();
        repositorio.matricular(novo);
    }
}
