import java.util.ArrayList;

public class Usuario extends Pessoa{
    private int id;
    public ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, int id) {
        super(nome);
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
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


    public int getId(){
        return id;
    }

    public ArrayList<Livro> getLivrosEmprestados(){
        return livrosEmprestados;
    }

    public String getNome() {
        return nome;
    }
}
