import java.util.ArrayList;

public class Usuario extends Pessoa{
    public ArrayList<Livro> livrosEmprestados;

    /**
     * Construtor da classe Usuario.
     * Inicializa a lista de livros emprestados e passa o nome e ID para a classe super (Pessoa).
     *
     * @param nome Nome do usuário
     * @param id Identificador único do usuário
     */

    public Usuario(String nome, int id) {
        super(nome, id);
        this.livrosEmprestados = new ArrayList<>();
    }

    /**
     * Sobrescreve o método exibirDetalhes da classe Pessoa para exibir informações específicas do Usuário.
     * Exibe o nome, o ID e a quantidade de livros que o usuário tem emprestados.
     */

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("ID: " + getId());
        System.out.println("Livros emprestados: " + livrosEmprestados.size());
    }

    /**
     * Adiciona um livro à lista de livros emprestados, se o usuário não tiver atingido o limite de 3 livros.
     *
     * @param livro O livro a ser adicionado
     */

    public void adicionarLivro(Livro livro) {
        if (livrosEmprestados.size() < 3) {
            livrosEmprestados.add(livro);
        } else {
            System.out.println("Limite de livros emprestados atingido.");
        }
    }

    /**
     * Remove um livro da lista de livros emprestados e o devolve.
     *
     * @param livro O livro a ser removido
     * @return true se o livro foi removido com sucesso, false caso contrário
     */

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
