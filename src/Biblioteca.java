import java.util.ArrayList;

/**
 * Classe Biblioteca
 * Responsável por gerir o cadastro de livros e utilizadores, além de realizar
 * operações de empréstimo e devolução de livros
 */

public class Biblioteca {
    private final ArrayList<Livro> livros;
    private final ArrayList<Usuario> usuarios;

    /**
     * Construtor da class Biblioteca
     * Inicializa as listas de livro e usuários
     */

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    /**
     * Cadastra um novo livro de biblioteca
     * @param livro livro Objeto do tipo Livro a ser cadastrado
     */

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);

        System.out.println("Livro cadastrado: " + livro.getTitulo());
    }

    /**
     * Cadastra um novo usuário na biblioteca
     * @param usuario Objeto de tipo Usuario a ser cadastrado
     */

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);

        System.out.println("Usuário cadastrado: " + usuario.getNome());
    }

    /**
     * Realiza o empréstimo de um livro para o usuário
     *
     * @param isbn isbn Código ISBN do livro a ser emprestado.
     * @param idUsuario Identificador do usuário que realizará o emprestamo
     */

    public void realizarEmprestimo(String isbn, int idUsuario) {
        Livro livro = encontrarLivroPorISBN(isbn);
        Usuario usuario = encontrarUsuarioPorId(idUsuario);

        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }
        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }
        if (livro.isDisponivel()) {
            usuario.adicionarLivro(livro);
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            System.out.println("Empréstimo não realizado. Verifique disponibilidade ou limite de livros.");
        }
    }

    /**
     * Realiza a devolução de um livro emprestado por um usuário.
     *
     * @param isbn      Código ISBN do livro a ser devolvido.
     * @param idUsuario Identificador do usuário que realizará a devolução.
     */
    public void realizarDevolucao(String isbn, int idUsuario) {
        Livro livro = encontrarLivroPorISBN(isbn);
        Usuario usuario = encontrarUsuarioPorId(idUsuario);

        if (livro == null || usuario ==null) {
            System.out.println("Erro ao devolver o livro.");
            return;
        }

        if (usuario.removerLivro(livro)) {
            System.out.println("Livro devolvido com sucesso. ");
        } else {
            System.out.println("Este livro não está na lista de livros emprestados do usuário.");
        }
    }

    /**
     * Exibe no console a lista de livros disponíveis para empréstimo.
     */

    public void exibirLivrosDisponiveis() {
        System.out.println("Livros disponíveis: ");
        for (Livro livro : livros) {
            // Usando o getter isDisponivel() para acessar a disponibilidade do livro
            if (livro.isDisponivel()) {
                System.out.println("Título: " + livro.getTitulo() + "Autor: " + livro.getAutor() + "ISBN: " + livro.getIsbn());
            }
        }
    }

    /**
     * Busca um livro na lista de livros cadastrados pelo ISBN.
     *
     * @param isbn Código ISBN do livro a ser encontrado.
     * @return Objeto Livro correspondente ao ISBN, ou null se não for encontrado.
     */

    private Livro encontrarLivroPorISBN(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    /**
     * Busca um usuário na lista de usuários cadastrados pelo ID.
     *
     * @param idUsuario Identificador do usuário a ser encontrado.
     * @return Objeto Usuario correspondente ao ID, ou null se não for encontrado.
     */

    private Usuario encontrarUsuarioPorId(int idUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == idUsuario) {
                return usuario;
            }
        }
        return null;
    }
}
