import java.util.Scanner;

public final class Academia {

    public static void line() {
        System.out.print("===========================================================\n");
    }
    public static void main(String[] args) throws Exception {    
        // Academia extende Endereco por que a Academia tem um endereço próprio, é nisso que será usado
        Scanner scan = new Scanner(System.in);
        Aluno[] listaAlunos = new Aluno[100];
        Aluno aluno = new Aluno();

        int numeroAlunos = 0;


        System.out.print("\n\n");
        line();
        System.out.print("====================== MAROMBA'S GYM ======================\n");
        line();
        Thread.sleep(1500);

        int opcao = 0;
        do {

            System.out.print("[1] - Fazer Cadastro\n[2] - Ver Treinos Disponíveis\n[ 3 ] - Ver Instrutores\n[4] - Sair\n");
            System.out.print("Opção: ");
            opcao = scan.nextInt();
            line();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do aluno(a): ");
                    String nome = scan.next();
                    line();
                    System.out.print("CPF: ");
                    String cpf = scan.next();
                    line();
                    System.out.print("Mensalidade:\n[ 1 ] - Civil Marombinha - R$ 60\n[ 2 ] - Padawan Maromba - R$ 80\n[ 3 ] - Mestre Marombão R$ 100\n");
                    System.out.print("Opção: ");
                    int opcaoMensalidade = scan.nextInt();
                    int mensalidade = 0;

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
                            System.out.print("Mensalidade padrão: Civil Marombinha - R$ 60,00");
                            mensalidade = 60;
                            Thread.sleep(2000);
                            break;
                    }
                    
                    line();
                    System.out.print("Cidade: ");
                    String cidade = scan.next();
                    line();
                    System.out.print("Estado: ");
                    String estado = scan.next();
                    line();
                    System.out.print("Bairro: ");
                    String bairro = scan.next();
                    line();
                    System.out.print("Rua: ");
                    String rua = scan.next();
                    line();
                    System.out.print("Complemento: ");
                    String complemento = scan.next();
                    line();
                    System.out.print("Número: ");
                    String numero = scan.next();
                    line();
                    System.out.print("CEP: ");
                    String cep = scan.next();
                    line();

                    System.out.print("CADASTRO REALIZADO!\n");
                    numeroAlunos++;
                    Thread.sleep(2000);
                    line();

                    Endereco endereco = new Endereco(cidade, estado, bairro, rua, complemento, numero, cep);
                
                    listaAlunos[0] = new Aluno(nome, cpf, mensalidade, endereco); // endereco aqui é do objeto endereco logo acima

                    // DESEJA VER OS SEUS DADOS? S/N

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
                    // Instrutores e horários disponíveis
                    break;
            
                case 4:
                    System.out.println("Saindo...");
                    line();
                    Thread.sleep(2000);
                    break;

                default:
                    System.err.println("Valor inválido!");
                    Thread.sleep(2000);
                    line();
                    break;
            }
        } while(opcao != 3);
    }
}
