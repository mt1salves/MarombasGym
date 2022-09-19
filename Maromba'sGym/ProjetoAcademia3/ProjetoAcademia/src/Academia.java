public class Academia {
    private Endereco endereco;

    public Academia(String cep, String cidade, String estado, String bairro, String rua, String numero, String complemento) {
        endereco.cep = cep;
        endereco.cidade = cidade;
        endereco.estado = estado;
        endereco.bairro = bairro;
        endereco.rua = rua;
        endereco.numero = numero;
        endereco.complemento = complemento;
    }

    public String EnderecoCompletoAcademia() {
        return "CEP: " + endereco.cep + "\nCidade: " + endereco.cidade + "\nEstado: " + endereco.estado + "\nBairro: " + endereco.bairro + "\nRua: " + endereco.rua + "\nComplemento: " + endereco.complemento + "\nNúmero: " + endereco.numero;
    }

}
