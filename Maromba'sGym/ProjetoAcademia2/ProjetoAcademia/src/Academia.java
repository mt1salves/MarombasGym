public class Academia extends Endereco{

    public Academia(String cep, String cidade, String estado, String bairro, String rua, String numero, String complemento) {
        super(cep, cidade, estado, bairro, rua, numero, complemento);
    }

    public String EnderecoCompletoAcademia() {
        return "CEP: " + this.cep + "\nCidade: " + this.cidade + "\nEstado: " + this.estado + "\nBairro: " + this.bairro + "\nRua: " + this.rua + "\nComplemento: " + this.complemento + "\nNúmero: " + this.numero;
    }

}
