public class Academia {
    protected Endereco endereco;

    public Academia(Endereco endereco) {
        this.endereco = endereco;
    }

    public String EnderecoCompletoAcademia() {
        return "CEP: " + this.endereco.cep + "\nCidade: " + this.endereco.cidade + "\nEstado: " + this.endereco.estado + "\nBairro: " + this.endereco.bairro + "\nRua: " + this.endereco.rua + "\nComplemento: " + this.endereco.complemento + "\nNúmero: " + this.endereco.numero;
    }

}
