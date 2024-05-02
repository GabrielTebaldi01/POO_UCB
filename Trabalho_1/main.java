import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
        //Professor professor = new Professor("Carlos", 35, 'M', "Educação Física", 3000.0);

        int opcao;
        do {
            System.out.println("Selecione a opção desejada:");
            System.out.println("1 - Ver treino");
            System.out.println("2 - Cadastro de aluno");
            System.out.println("3 - Atribuir treino a aluno");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do aluno:");
                    String nomeAluno = scanner.nextLine();
                    Aluno aluno = cadastro.buscarAluno(nomeAluno);
                    if (aluno != null) {
                        System.out.println("Plano de treino do aluno " + aluno.getNome() + ":");
                        System.out.println(aluno.getPlanoTreino());

                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                    case 2:
                    System.out.println("Digite o nome do aluno:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a idade do aluno:");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.println("Digite o gênero do aluno (M/F):");
                    char genero = scanner.nextLine().charAt(0);
                    System.out.println("Digite a mensalidade do aluno:");
                    double mensalidade = scanner.nextDouble();
                    scanner.nextLine(); 
                
                    
                    Treino treinoAluno = new Treino("", 0, "", ""); 
                
                    
                    Aluno novoAluno = new Aluno(nome, idade, genero, treinoAluno, mensalidade);
                    cadastro.cadastrarAluno(novoAluno);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                    
                    case 3:
                    System.out.println("Digite o nome do aluno:");
                    String nomeAlunoParaTreino = scanner.nextLine();
                    System.out.println("Digite o nome do treino:");
                    String nomeTreino = scanner.nextLine();
                    System.out.println("Digite o tipo de treino do aluno:");
                    String tipoDeTreinoAluno = scanner.nextLine();
                    System.out.println("Digite os exercícios do treino:");
                    String exerciciosAluno = scanner.nextLine();
                    System.out.println("Digite a duração do treino em minutos:");
                    int duracaoTreinoAluno = scanner.nextInt();
                    scanner.nextLine(); 
                
                    Treino treino = new Treino(nomeTreino, duracaoTreinoAluno, tipoDeTreinoAluno, exerciciosAluno);
                    cadastro.atribuirTreino(nomeAlunoParaTreino, treino);
                    System.out.println("Treino atribuído com sucesso!");
                    break;
                
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
