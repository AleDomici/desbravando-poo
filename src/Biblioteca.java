import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Livro> livros;
    public ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void cadastroUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void realizarEmprestimo(String isbn, int idUsuario) {
        Livro livro = buscarLivroPorIsbn(isbn);
        Usuario = usuario = buscarUsuarioPorId(idUsuario);

        if (livro != null && usuario != null && usuario.livrosEmprestados.contains(livro)) {
            livro.devolver();
            usuario.removerLivro(livro);

            System.out.println("Devolução realizada com sucesso!");
        } else {
            System.out.println("Devolução não pode ser realizada.");
        }
    }


}
