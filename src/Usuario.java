import java.util.ArrayList;

public class Usuario extends Pessoa{

    public ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, int id) {
        super(nome, id);
        this.livrosEmprestados = new ArrayList<>();
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("ID: " + getId());
        System.out.println("Livros emprestados: " + livrosEmprestados.size());
    }

    public void adicionarLivro(Livro livro) {
        if (livrosEmprestados.size() < 3) {
            livrosEmprestados.add(livro);
        } else {
            System.out.println("Limite de livros emprestados atingido.");
        }
    }

    public boolean removerLivro(Livro livro) {
            if (livrosEmprestados.contains(livro)) {
                livrosEmprestados.remove(livro);
                livro.devolver();
                return true;
            } else {
                return false;
            }
    }
}
