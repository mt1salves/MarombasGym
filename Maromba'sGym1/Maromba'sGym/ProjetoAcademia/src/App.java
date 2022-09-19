// Crie uma conta no stackoverflow e tente resolver o porblema dos acentos no scanner pra exibir. Dê o link do código no github

import java.util.Scanner;
import javax.swing.JOptionPane;

public final class App {  
    // Método de linha, apenas visual. 
    public static void line() {
        System.out.print("=====================================================================\n");
    }

    // Verifica se o usuário deixou vazio um campo, ou seja, sem preencher.
    public static String estaVazio(String texto, String campo) throws InterruptedException {
        Scanner scan = new Scanner(System.in, "UTF-8"); 
        while(texto.isEmpty()) {
            line();
            System.err.print("VOCÊ NÃO PREENCHEU O CAMPO!\n");
            line();
            Thread.sleep(2000);
            System.out.print("Digite o " + campo + " de novo: ");
            texto = scan.nextLine().trim();
        }
        return texto;
    }

    public static void main(String[] args) throws Exception {  
        Scanner scan = new Scanner(System.in, "UTF-8"); 
        Aluno[] listaAlunos = new Aluno[99]; // Capacidade de 100 cadastro de alunos (0-99) 
        Aluno aluno = new Aluno();

        int numeroAlunos = 0, matricula = 202200, codigo = 100000;
        
        JOptionPane.showMessageDialog(null, "Bem-Vindo(a) a MAROMBA'S GYM!", "MAROMBA'S GYM", JOptionPane.INFORMATION_MESSAGE);
        
        System.out.print("\n\n");
        line();
        System.out.print("=========================== MAROMBA'S GYM ===========================\n");
        line();
        Thread.sleep(1500);

        int opcao = 0;
        
        do {
            // Exibe o menu
            System.out.print("[ 1 ] - Fazer Cadastro\n[ 2 ] - Ver Treinos Disponíveis\n[ 3 ] - Ver Instrutores\n[ 4 ] - Endereço da Academia\n[ 5 ] - Calcular IMC\n[ 6 ] - Sair\n");
            System.out.print("Opção: ");
            opcao = scan.nextInt();
            line();

            switch (opcao) {
                case 1:
                    scan.nextLine(); // Limpa o buffer do teclado

                    System.out.print("Nome do aluno(a): ");
                    String nome = scan.nextLine().trim();
                    if (nome.isEmpty()) nome = estaVazio(nome, "nome");
                    line();

                    System.out.print("Sobrenome do aluno(a): ");
                    String sobrenome = scan.nextLine().trim();
                    if (sobrenome.isEmpty()) sobrenome = estaVazio(sobrenome, "sobrenome");
                    line();

                    System.out.print("Idade do aluno(a): ");
                    int idade = scan.nextInt();
                    line();

                    scan.nextLine(); // Limpa o buffer do teclado
                    System.out.print("CPF: ");
                    String cpf = scan.nextLine().trim();
                    // Validação de CPF
                    while(cpf.length() != 11) {
                        line();
                        System.err.print("CPF INVÁLIDO!\n");
                        line();
                        System.out.print("CPF: ");
                        cpf = scan.nextLine().trim();
                    }
                    line();

                    System.out.print("Mensalidade:\n[ 1 ] - Civil Marombinha (3 dias) - R$ 60,00\n[ 2 ] - Padawan Maromba (5 dias) - R$ 80,00\n[ 3 ] - Mestre Jedi Marombão (7 dias) - R$ 100,00\n");
                    System.out.print("Opção: ");
                    int opcaoMensalidade = scan.nextInt();
                    
                    float mensalidade = 0;

                    switch (opcaoMensalidade) {
                        case 1:
                            mensalidade = 60;
                            break;
                        
                        case 2:
                            mensalidade = 80;
                            break;
                            
                        case 3:
                            mensalidade = 100;
                            break;
                    
                        default:
                            System.out.print("Mensalidade padrão: Civil Marombinha (3 dias) - R$ 60,00\n");
                            mensalidade = 60;
                            Thread.sleep(2000);
                            break;
                    }
                    
                    line();
                    scan.nextLine(); // Limpa o buffer do teclado

                    System.out.print("CEP: ");
                    String cep = scan.nextLine().trim();
                    // Validação de CEP
                    while(cep.length() != 8) {
                        line();
                        System.err.print("CEP INVÁLIDO!\n");
                        line();
                        System.out.print("CEP: ");
                        cep = scan.nextLine().trim();
                    }
                    line();

                    System.out.print("Cidade: ");
                    String cidade = scan.nextLine().trim();
                    if (cidade.isEmpty()) cidade = estaVazio(cidade, "cidade");
                    line();

                    System.out.print("Estado: ");
                    String estado = scan.nextLine().trim();
                    if (estado.isEmpty()) estado = estaVazio(estado, "estado");
                    line();

                    System.out.print("Bairro: ");
                    String bairro = scan.nextLine().trim();
                    if (bairro.isEmpty()) bairro = estaVazio(bairro, "bairro");
                    line();

                    System.out.print("Rua: ");
                    String rua = scan.nextLine().trim(); 
                    if (rua.isEmpty()) rua = estaVazio(rua, "rua");
                    line();

                    System.out.print("Número: "); 
                    String numero = scan.nextLine().trim();
                    if (numero.isEmpty()) numero = estaVazio(numero, "número");
                    line();

                    System.out.print("Complemento: ");
                    String complemento = scan.nextLine().trim();
                    if (complemento.isEmpty()) complemento = estaVazio(complemento, "complemento");
                    line();

                    System.out.print("CADASTRO REALIZADO!\n");
                    Thread.sleep(2000);
                    line();

                    // Armazena o endereço do novo cliente
                    Endereco endereco = new Endereco(cep, cidade, estado, bairro, rua, numero, complemento);
                    // Armazena os dados do cliente na lista de alunos da academia
                    listaAlunos[numeroAlunos] = new Aluno(nome, sobrenome, idade, cpf, matricula, mensalidade, endereco); 

                    String respDados = "";
                    System.out.print("Deseja ver todos os seus dados cadastrados [S/N]? ");
                    respDados = scan.next().toUpperCase().strip();
                    line();
                    
                    if("S".equals(respDados)) {
                        // Exibe os dados do aluno cadastrado
                        System.out.println(listaAlunos[numeroAlunos].TodosDadosCliente());
                        line();
                        Thread.sleep(2000);
                    }
                    
                    matricula++; // Mais uma matrícula
                    numeroAlunos++; // Mais 1 aluno
                    break;
                
                case 2:
                    System.out.print("Treinos: \n[ 1 ] - Peito\n[ 2 ] - Costas\n[ 3 ] - Perna\n[ 4 ] - Abdômem\nOpção: ");
                    int opcaoTreino = scan.nextInt();
                    line();

                    switch (opcaoTreino) {
                        case 1:
                            aluno.TreinoPeito();
                            line();
                            Thread.sleep(3000);
                            break;

                        case 2:
                            aluno.TreinoCostas();
                            line();
                            Thread.sleep(3000);
                            break;

                        case 3:
                            aluno.TreinoPerna();
                            line();
                            Thread.sleep(3000);
                            break;
                        
                        case 4:
                            aluno.TreinoAbdominal();
                            line();
                            Thread.sleep(3000);
                            break;

                        default:
                            System.err.println("Valor inválido!");
                            Thread.sleep(2000);
                            line();
                            break;
                    }
                    break;

                case 3:
                    // Cadastro dos instrutores
                    Instrutor Godofreudo = new Instrutor("Godofreudo", "Marombinha", 29, "12345678900", codigo);
                    codigo++; // Mais um instrutor

                    Instrutor Jubileusson = new Instrutor("Jubileusson", "Maromba", 33, "98765432100", codigo);
                    codigo++; // Mais um instrutor

                    Instrutor Jhereynt = new Instrutor("Jhereynt", "Marombão", 37, "12365478900", codigo);
                    codigo++; // Mais um instrutor

                    Thread.sleep(650);
                    System.out.println(Godofreudo.DadosInstrutor() + " | Horário: 5:00 às 11:00");
                    Thread.sleep(650);
                    System.out.println(Jubileusson.DadosInstrutor() + " | Horário: 11:00 às 17:00");
                    Thread.sleep(650);
                    System.out.println(Jhereynt.DadosInstrutor() + " | Horário: 17:00 às 23:00");
                    Thread.sleep(650);

                    line();
                    Thread.sleep(2000);
                    break;
            
                    case 4:
                    // Endereço da Academia. Cria uma instância da classe Endereco.
                    Endereco enderecoAcademia = new Endereco("46165000", "Dom Basílio", "Bahia", "Centro", "Rua dos Marombas", "713", "Edifício");
                    // Adiciona o objeto enderecoAcademia no objeto marombas.
                    Academia marombas = new Academia(enderecoAcademia);
                    
                    System.out.print(marombas.EnderecoCompletoAcademia());
                    System.out.print("\n");
                    line();
                    Thread.sleep(2000);
                    break;

                case 5:
                    // Cálculo de IMC
                    System.out.print("Digite seu peso (KG): ");
                    float peso = scan.nextFloat();
                    System.out.print("Digite sua altura (M): ");
                    float altura = scan.nextFloat();
                    double imc = aluno.Imc(peso, altura);

                    System.out.printf("-> Seu IMC: %.2f\n", aluno.Imc(peso, altura));
                    System.out.printf("-> " + aluno.resultadoImc(imc));

                    System.out.printf("\n");
                    line();
                    Thread.sleep(2000);
                    break;

                case 6:
                    System.out.println("Saindo...");
                    line();
                    Thread.sleep(2000);
                    line();
                    line();
                    System.out.print("******************** TODOS OS ALUNOS CADASTRADOS ********************\n");
                    line();
                    line();

                    // Exibe nome, sobrenome e matrícula de todos os alunos cadastrados
                    for(int i = 0; i < numeroAlunos; i++) {
                        System.out.println(listaAlunos[i].DadosBasicosCliente());
                        line();
                    }

                    JOptionPane.showMessageDialog(null, "Obrigado. Volte Sempre!", "MAROMBA'S GYM", JOptionPane.INFORMATION_MESSAGE);

                    break;

                default:
                    System.err.println("Valor inválido!");
                    line();
                    Thread.sleep(2000);
                    break;
            }
        } while(opcao != 6); // Condição de saída do programa

        System.out.print("\n\n");

        scan.close(); // Fechar Scanner
        System.exit(0); // Fechar execução do código
    }
}
