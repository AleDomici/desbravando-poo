import java.util.ArrayList;

public class Biblioteca {
    private final ArrayList<Livro> livros;
    private final ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);

        System.out.println("Livro cadastrado: " + livro.getTitulo());
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);

        System.out.println("Usuário cadastrado: " + usuario.getNome());
    }

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

    public void exibirLivrosDisponiveis() {
        System.out.println("Livros disponíveis: ");
        for (Livro livro : livros) {
            // Usando o getter isDisponivel() para acessar a disponibilidade do livro
            if (livro.isDisponivel()) {
                System.out.println("Título: " + livro.getTitulo() + "Autor: " + livro.getAutor() + "ISBN: " + livro.getIsbn());
            }
        }
    }

    private Livro encontrarLivroPorISBN(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    private Usuario encontrarUsuarioPorId(int idUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == idUsuario) {
                return usuario;
            }
        }
        return null;
    }
}
