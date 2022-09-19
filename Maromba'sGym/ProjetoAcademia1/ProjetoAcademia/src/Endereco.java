public class Endereco {
    protected String cep;
    protected String cidade;
    protected String estado;
    protected String bairro;
    protected String rua;
    protected String numero;
    protected String complemento;

    // Construtores
    public Endereco(String cep, String cidade, String estado, String bairro, String rua, String numero, String complemento) {
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    public Endereco(String cep, String cidade, String estado) {
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Endereco(String rua, String bairro, String complemento, String numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.complemento = complemento;
        this.numero = numero;
    }

    public Endereco() {} 

    // Métodos Get e Set
    public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

    public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

    public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
    
    public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

    public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

    public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

    public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

    // Métodos de retorno
    public String TodosDadosEndereco() {
        return "CEP: " + this.cep + "\nCidade: " + this.cidade + "\nEstado: " + this.estado + "\nBairro: " + this.bairro + "\nRua: " + this.rua + "\nComplemento: " + this.complemento + "\nNúmero: " + this.numero;
    }

    public String DadosEnderecoNecessarios() {
        return "CEP: " + this.cep + "\nCidade: " + this.cidade + "\nEstado: " + this.estado;
    }    
    
    public String DadosEnderecoAdcionais() {
        return "Bairro: " + this.bairro + "\nRua: " + this.rua + "\nComplemento: " + this.complemento + "\nNúmero: " + this.numero;
    }
}   
