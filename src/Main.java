import javax.sound.midi.Soundbank;
import java.util.Arrays;
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
        System.out.println("Bem-vindo ao Sistema de Gerenciamento de Biblioteca! Escolha uma opção: ");
        System.out.println("1. Cadastrar livro");
        System.out.println("2. Cadastrar usuário");
        System.out.println("3. Realizar empréstimo");
        System.out.println("4. Realizar devolução");
        System.out.println("5. Exibir livros disponíveis");
        System.out.println("6. Sair");
    }
}