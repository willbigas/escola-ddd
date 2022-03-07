package br.com.alura.escola.academico.dominio.aluno;

public class Email {

    private String endereco;


    public Email(String endereco) {
        if (endereco == null || !endereco
                .matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$")) {
            throw new IllegalArgumentException("E-mail inválido!");
        }
        this.endereco = endereco;
    }


    public String getEndereco() {
        return endereco;
    }
}
