public class Instrutor extends Pessoa {
    private long codigo;

    // Construtores
    public Instrutor(String nome, String sobrenome, int idade, String cpf, long codigo) {
        super(nome, sobrenome, idade, cpf);
		this.codigo = codigo;
    }

    public Instrutor(String nome, String sobrenome, int idade) {
        super(nome, sobrenome, idade);
    }

    public Instrutor(Endereco endereco) {
        this.endereco = endereco;
    }

    public Instrutor() {}

    // Métodos Get e Set
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String DadosInstrutor() {
        return "Nome: " + getNome() + " " + getSobrenome() + " | Código: " + getCodigo();
    }
}
