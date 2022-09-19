import java.util.Random;

public class Aluno {

	private long matricula;
	private String nome;
	private String cpf;
	private float mensalidade;
    private Endereco endereco;
	
	// Construtores
	public Aluno(String nome, String cpf, float mensalidade) {
		Random rand = new Random();
		this.matricula = rand.nextInt(999999);
		this.nome = nome;
		this.cpf = cpf;
		this.mensalidade = mensalidade;
	}

	public Aluno(String nome, String cpf, float mensalidade, Endereco endereco) {
		Random rand = new Random();
		this.matricula = rand.nextInt(999999);
		this.nome = nome;
		this.cpf = cpf;
		this.mensalidade = mensalidade;
		this.endereco = endereco;
	}

    public Aluno(String nome, String cpf, float mensalidade , String cidade, String estado, String bairro, String rua, String numero, String complemento, String cep) {
		Random rand = new Random();
		this.matricula = rand.nextInt(999999);
		this.nome = nome;
		this.cpf = cpf;
		this.mensalidade = mensalidade;
        this.endereco = new Endereco(cidade, estado, bairro, rua, numero, complemento, cep);
	}

	public Aluno() {}

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
	public String DadosCliente() {
		return "Aluno: " + this.nome + "\nMatrícula: " + this.matricula + "\nCPF: " + this.cpf + "\nValor da mensalidade: " + this.mensalidade + "\nRua: "+ this.endereco.getRua() + "\nBairro: " + this.endereco.getBairro() + "\nNúmero: " + this.endereco.getNumero();
	}

    public String NomeCliente() {
		return "Aluno: " + this.nome;
	}

    public String CpfCliente() {
		return "CPF: " + this.cpf;
	}

	// Treinos
	public void TreinoPeito() {
		System.out.print("VOADOR PEITORAL 1X12, 1X10, 1X9, 1X8 , 1X6 (AUMENTANDO CARGA)\nSUPINO RETO 3X12- DESCANSA 10SEG. - MAIS 10 REPETIÇOES (RESTPAUSE)\nFLAY INCLINADO 3X 12.10.8 (DROP)\nCRUCIFIXO COM HALTER 3X15\nTRICEPS FRANÇES - POLIA ALTA 3X15\nTRICEPS PULLEY 3X12.10.8 (DROP)\nTRICEPS COICE 3X15\nDESENVOLVIMENTO COM BARRA  3X15 (RESTPAUSE)\nREMADA ALTA NO CROSS 3X12\nELEVAÇÃO FRONTAL COM A BARRA H 3X15\n");
	}

	public void TreinoCostas() {
		System.out.print("PUXADA ALTA COM TRIÂNGULO 3X12.10.8 (DROP- REDUZINDO CARGA)\nCRUCIFIXO INVERSO COM HALTER 3X15\nREMADA CURVADA NO CROSS 3X12 - DESCANSA 10 SEG. - FAZER ATE A FALHA\nPUXADA ALTA 3X12 (RESTPAUSE)\nROSCA DIRETA COM A BARRA W 3X12\nROSCA UNILATERAL NO BANCO SCOOT 3X15\nROSCA COMBINADA  3X15 + ENCOLHIMENTO DE OMBROS\nROSCA INVERSA NA POLIA 3X12.10.8 (DROP)\n");
	}

	public void TreinoPerna() {
		System.out.print("AGACHAMENTO NO SMITT 3X12 - DESCANSA 10 SEG. - MAIS 10 REPETIÇOES - DESCANSA 10”- REALIZAR MAIS 8 REPETIÇOES\nLEG 45 3X12 (RESTPAUSE)\nCADEIRA EXTENSORA 3X14.12.10 (DROP)\nCADEIRA ABUTORA 3X20 - ISOMETRIA DE 30” - FALHA\nMESA FLEXORA 3X12.10.8 (DROP) + AFUNDO LIVRE 3X12\nHACK INVERSO 3X12 + CADEIRA FLEXORA 3X15\nPANTURRILHA UNI. NO SMITT 3X20\nPANTURRILHA BANCO 3X25\n");
	}

	public void TreinoAbdominal() {
		System.out.print("ABS COM ANILHA NO DECLINADO 3X20\nABS OBLIQUO 3X15\nABS BICICLETA 3X15\n");
	}
}
