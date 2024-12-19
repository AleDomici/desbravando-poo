import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criação de uma instância da classe Biblioteca para gerenciar o sistema
     Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
            //Loop While para interagir com o menu
        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();          //le a opção escolhida pelo user
             scanner.nextLine();

             // Bloco switch que executa uma ação conforme a opção escolhida pelo Usuário
             switch (opcao) {
                 case 1:
                     cadastrarLivro(scanner, biblioteca);

                 case 2:
                     cadastrarUsuario(scanner, biblioteca);
                     break;

                 case 3:
                     realizarEmprestimo(scanner, biblioteca);
                     break;

                 case 4:
                     realizarDevolucao(scanner, biblioteca);
                     break;

                 case 5:
                     exibirLivrosDisponiveis(biblioteca);
                     break;

                 case 6:
                     System.out.println("Encerrando o sistema. Até logo!");
                    scanner.close();
                    return;

                 default:
                     System.out.println("Opção inválida. Tente novamente.");
             }
        }
    }

    private static void exibirMenu() {
        System.out.println("Bem-vindo ao Sistema de Gerenciamento de Biblioteca!");
        System.out.println("1. Cadastrar livro");
        System.out.println("2. Cadastrar usuário");
        System.out.println("3. Realizar empréstimo");
        System.out.println("4. Realizar devolução");
        System.out.println("5. Exibir livros disponíveis");
        System.out.println("6. Sair");

        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarLivro(Scanner scanner, Biblioteca biblioteca) {
        System.out.println("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        System.out.println("Digite o autor do livro: ");
        String autor = scanner.nextLine();

        System.out.println("Digite o  ISBN do livro: ");
        String isbn = scanner.nextLine();

        Livro livro = new Livro(titulo, autor, isbn);
        biblioteca.cadastrarLivro(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    private static void cadastrarUsuario(Scanner scanner, Biblioteca biblioteca) {
        System.out.println("Digite o nome do usuário: ");
        String nome = scanner.nextLine();
        System.out.println("Digite ID do usuário: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Usuario usuario = new Usuario(nome, id);
        biblioteca.cadastrarUsuario(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    private static void realizarEmprestimo(Scanner scanner, Biblioteca biblioteca) {
        System.out.println("Digite ISBN do livro: ");
        String isbn = scanner.nextLine();
        System.out.println("Digite o ID do usuário: ");
        int idUsuario = Integer.parseInt(scanner.nextLine());

        biblioteca.realizarEmprestimo(isbn,idUsuario);
    }

    private static void realizarDevolucao(Scanner scanner, Biblioteca biblioteca) {
        System.out.println("Digite o ISBN do livro: ");
        String isbn = scanner.nextLine();
        System.out.println("Digite o ID do usuário: ");
        int idUsuario = Integer.parseInt(scanner.nextLine());

        biblioteca.realizarEmprestimo(isbn,idUsuario);
    }
    private static void exibirLivrosDisponiveis(Biblioteca biblioteca) {
        biblioteca.exibirLivrosDisponiveis();
    }
}