import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Livro> livros;
    public ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void cadastroLivro(Livro livro) {
        livros.add(livro);
    }

    public void cadastroUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void realizarEmprestimo(String isbn, int idUsuario) {
        Livro livro = buscarLivroPorIsbn(isbn);
        Usuario usuario = buscarUsuarioPorId(idUsuario);

        if (livro != null && usuario != null && livro.isDisponivel() && usuario.livrosEmprestados.size() < 3) {
            livro.emprestar();
            usuario.adicionarLivro(livro);
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            System.out.println("Empréstimo não pode ser realizado.");
        }
    }

    public void realizarDevolucao(String isbn, int idUsuario) {
        Livro livro = buscarLivroPorIsbn(isbn);
        Usuario usuario = buscarUsuarioPorId(idUsuario);

        if (livro != null && usuario != null && usuario.livrosEmprestados.contains(livro)) {
            livro.devolver();
            usuario.removerLivro(livro);
            System.out.println("Devolução realizada com sucesso!");
        } else {
            System.out.println("Devolução não pode ser realizada.");
        }
    }

    public void exibirLivrosDisponiveis() {
        for (Livro livro : livros) {
            // Usando o getter isDisponivel() para acessar a disponibilidade do livro
            if (livro.isDisponivel()) {
                livro.exibirDetalhes();
            }
        }
    }

    private Livro buscarLivroPorIsbn(String isbn) {
        for (Livro livro : livros) {
            if (livro.isbn.equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    private Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.id == id) {
                return usuario;
            }
        }
        return null;
    }
}
