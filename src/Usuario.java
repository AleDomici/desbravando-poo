import java.util.ArrayList;

public class Usuario {
    public String nome;
    public int id;
    public ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        if (livrosEmprestados.size() < 3) {
            livrosEmprestados.add(livro);
        } else {
            System.out.println("Limite de livros emprestados atingido.");
        }
    }

    public void removerLivro(Livro livro) {
        if (livrosEmprestados.contains(livro)) {
            livrosEmprestados.remove(livro);
        } else {
            System.out.println("Este livro não está na lista de livros emprestados.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + ", ID: " + id + " Livros Emprestados: " + livrosEmprestados.size());
    }
}
