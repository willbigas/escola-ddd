package br.com.alura.escola.academico.dominio.aluno;

public class AlunoNaoEncontradoException extends RuntimeException {

    public AlunoNaoEncontradoException(CPF cpf) {
        super("Aluno não encontrado com CPF: " + cpf.getNumero());
    }


}
