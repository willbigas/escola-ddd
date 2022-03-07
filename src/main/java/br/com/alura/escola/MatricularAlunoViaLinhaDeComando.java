package br.com.alura.escola;

import br.com.alura.escola.academico.aplicacao.aluno.matricular.DadosDoAlunoDTO;
import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatriculadorDeAluno;
import br.com.alura.escola.gamificacao.aplicacao.GeraSeloAlunoNovato;
import br.com.alura.escola.gamificacao.infra.selo.RepositorioDeSelosEmMemoria;
import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaLinhaDeComando {

    public static void main(String[] args) {
        String nome = "Fulano da Silva";
        String cpf = "123.456.789-00";
        String email = "fulano@email.com";

        PublicadorDeEventos publicador = new PublicadorDeEventos();
        publicador.adicionar(new LogDeAlunoMatriculado());
        publicador.adicionar(new GeraSeloAlunoNovato(new RepositorioDeSelosEmMemoria()));

        MatriculadorDeAluno matriculadorDeAluno = new MatriculadorDeAluno(new RepositorioDeAlunosEmMemoria(), publicador);
        matriculadorDeAluno.matricular(new DadosDoAlunoDTO(nome , cpf, email));
    }
}
