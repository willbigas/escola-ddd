public class Telefone {

    private String ddd;
    private String numero;


    public Telefone(String ddd, String numero) {
        if (ddd.length() > 2 || numero.length() > 9) {
            throw new IllegalArgumentException("DDD ou Número contem quantidade de digitos inválidos (2) DDD , (9) Número!");
        }
        this.ddd = ddd;
        this.numero = numero;
    }
}
