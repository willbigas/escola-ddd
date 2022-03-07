package br.com.alura.escola.academico.dominio.aluno;

public class CPF {

    private String numero;

    public CPF(String numero) {
        if (numero == null || !numero.matches("^((\\d{3}).(\\d{3}).(\\d{3})-(\\d{2}))*$")) {
            throw new IllegalArgumentException("br.com.alura.escola.aluno.CPF Inválido!");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
}
