public class Aluno extends Pessoa {
	private long matricula;
	private float mensalidade;

	// Construtores
	public Aluno() {}

	public Aluno(String nome, String sobrenome, int idade, String cpf, long matricula, float mensalidade, Endereco endereco) {
		super(nome, sobrenome, idade, cpf);
		this.matricula = matricula;
		this.mensalidade = mensalidade;
		this.endereco = endereco;
	}
	
	public Aluno(String nome, String sobrenome, int idade, String cpf, float mensalidade) {
		super(nome, sobrenome, idade, cpf);
		this.matricula = matricula++;
		this.mensalidade = mensalidade;
	}


    public Aluno(String nome, String cpf, float mensalidade, Endereco endereco) {
		super(nome, cpf);
		this.mensalidade = mensalidade;
        this.endereco = endereco;
	}

    // Métodos Get e Set
	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

    // Métodos de retorno
	public String TodosDadosCliente() {
		return "Nome do aluno(a): " + this.nome + "\nSobrenome: " + this.sobrenome + "\nIdade: " + this.idade + "\nCPF: " + this.cpf + "\nMatrícula: " + this.matricula + "\nValor da mensalidade: R$ " + this.mensalidade + "\nCEP: " + this.endereco.getCep() + "\nCidade: " + this.endereco.getCidade() + "\nEstado: " + this.endereco.getEstado() + "\nBairro: " + this.endereco.getBairro() + "\nRua: " + this.endereco.getRua() +  "\nNúmero: " + this.endereco.getNumero() + "\nComplemento: " + this.endereco.getComplemento();
	}

	public String AlgunsDadosCliente() {
		return "Nome do aluno(a): " + this.nome + "\nSobrenome: " + this.sobrenome + "\nIdade: " + this.idade + "\nMatrícula: " + this.matricula + "\nValor da mensalidade: R$ " + this.mensalidade + "\nCEP:" + this.endereco.getCep() + "\nCidade: " + this.endereco.getCidade() + "\nEstado: " + this.endereco.getEstado();
	}

    public String DadosBasicosCliente() {
		return "Aluno(a): " + this.nome + " | Sobrenome: "+ this.getSobrenome() + " | Matrícula: " + this.getMatricula();
	}

    public String CpfCliente() {
		return "CPF: " + this.cpf;
	}

	// IMC
	public double Imc(float peso, float altura) {
		
		double imc = peso / Math.pow(altura, 2);

		return imc;
	}

	public String resultadoImc(double imc) {
	   String result;

	   if (imc < 18.5)
		  	result = "ABAIXO DO PESO.";
	   else if (imc < 25)
			result = "PESO IDEAL.";
		else if (imc < 30)
			result = "LEVEMENTE ACIMA DO PESO.";
		else if (imc < 35)
			result = "OBESIDADE GRAU 1.";
		else if (imc < 40)
			result = "OBESIDADE GRAU 2 (SEVERA).";
		else
		   	result = "OBESIDADE GRAU 3 (MÓRBIDA)."; 
	   
	   return result;
	}

	// Treinos
	public void TreinoPeito() {
		System.out.print("VOADOR PEITORAL 1X12, 1X10, 1X9, 1X8 , 1X6 (AUMENTANDO CARGA)\nSUPINO RETO 3X12 - DESCANSA 10SEG. - MAIS 10 REPETIÇOES (RESTPAUSE)\nFLAY INCLINADO 3X12.10.8 (DROP)\nCRUCIFIXO COM HALTER 3X15\nTRÍCEPS FRANÇÊS - POLIA ALTA 3X15\nTRÍCEPS PULLEY 3X12.10.8 (DROP)\nTRÍCEPS COICE 3X15\nDESENVOLVIMENTO COM BARRA 3X15 (RESTPAUSE)\nREMADA ALTA NO CROSS 3X12\nELEVAÇÃO FRONTAL COM A BARRA H 3X15\n");
	}

	public void TreinoCostas() {
		System.out.print("PUXADA ALTA COM TRIÂNGULO 3X12.10.8 (DROP - REDUZINDO CARGA)\nCRUCIFIXO INVERSO COM HALTER 3X15\nREMADA CURVADA NO CROSS 3X12 - DESCANSA 10 SEG. - FAZER ATE A FALHA\nPUXADA ALTA 3X12 (RESTPAUSE)\nROSCA DIRETA COM A BARRA W 3X12\nROSCA UNILATERAL NO BANCO SCOOT 3X15\nROSCA COMBINADA 3X15 + ENCOLHIMENTO DE OMBROS\nROSCA INVERSA NA POLIA 3X12.10.8 (DROP)\n");
	}

	public void TreinoPerna() {
		System.out.print("AGACHAMENTO NO SMITT 3X12.10.8 - DESCANSO DE 10 SEG\nLEG 45 graus 3X12 (RESTPAUSE)\nCADEIRA EXTENSORA 3X14.12.10 (DROP)\nCADEIRA ABDUTORA 3X20 - ISOMETRIA DE 30 segs. - FALHA\nMESA FLEXORA 3X12.10.8 (DROP) + AFUNDO LIVRE 3X12\nHACK INVERSO 3X12 + CADEIRA FLEXORA 3X15\nPANTURRILHA UNI. NO SMITT 3X20\nPANTURRILHA BANCO 3X25\n");
	}

	public void TreinoAbdominal() {
		System.out.print("ABS COM ANILHA NO DECLINADO 3X20\nABS OBLÍQUO 3X15\nABS BICICLETA 3X15\n");
	}
}
