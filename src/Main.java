import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bem-vindo(a) ao Sistema de Gerenciamento de Biblioteca!");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Cadastrar usuário");
            System.out.println("3. Realizar empréstimo");
            System.out.println("4. Realizar devolução");
            System.out.println("5. Exibir livros disponíveis");
            System.out.println("6. Sair");
            System.out.println("Escolha uma opção: ");

            int opcao = scanner.nextInt();
             scanner.nextLine();

             switch (opcao) {
                 case 1:
                     System.out.print("Digite o título do livro: ");
                     String titulo = scanner.nextLine();
                     System.out.print("Digite o autor do livro: ");
                     String autor = scanner.nextLine();
                     System.out.print("Digite o ISBN do livro: ");
                     String isbn = scanner.nextLine();
                     biblioteca.cadastroLivro(new Livro(titulo, autor, isbn));
                     System.out.println("Livro cadastrado com sucesso!");

                     break;

                 case 2:
                     System.out.print("Digite o nome do usuário: ");
                     String nome = scanner.nextLine();
                     System.out.print("Digite o ID do usuário: ");
                     int id = scanner.nextInt();
                     scanner.nextLine();

                     biblioteca.cadastroUsuario(new Usuario(nome, id));
                     System.out.println("Usuário cadastrado com sucesso!");
                     break;

                 case 3:
                     System.out.println("Digite o Isbn do livro: ");
                     String isbnEmprestimo = scanner.nextLine();
                     System.out.println("Digite o ID do usuário: ");
                     int idUsuarioEmprestimo = scanner.nextInt();
                     scanner.nextLine();
                     biblioteca.realizarEmprestimo(isbnEmprestimo, idUsuarioEmprestimo);
                     break;

                 case 4:
                     System.out.println("Digite o Isbn do livro: ");
                     String isbnDevolucao = scanner.nextLine();
                     System.out.println("Digite o ID do usuário: ");
                     int idUsuarioDevolucao = scanner.nextInt();
                     scanner.nextLine();
                     biblioteca.realizarEmprestimo(isbnDevolucao, idUsuarioDevolucao);
                     break;

                 case 5:
                     System.out.println("Livros disponiveis: ");
                     biblioteca.exibirLivrosDisponiveis();
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
}