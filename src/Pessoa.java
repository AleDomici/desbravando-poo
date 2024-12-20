/**
 * Classe abstrata Pessoa.
 * Representa uma entidade genérica com nome e ID.
 * Deve ser estendida por classes concretas que implementem o método abstrato {@code exibirDetalhes}.
 */
public abstract class Pessoa {
    private String nome;
    private int id;

    /**
     * Construtor da classe Pessoa.
     *
     * @param nome O nome da pessoa.
     * @param id O identificador único da pessoa.
     */
    public Pessoa(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    /**
     * Obtém o nome da pessoa.
     *
     * @return O nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Obtém o identificador único da pessoa.
     *
     * @return O ID da pessoa.
     */
    public int getId() {
        return id;
    }

    /**
     * Método abstrato para exibir os detalhes da pessoa.
     * Deve ser implementado pelas classes concretas que estendem esta classe.
     */
    public abstract void exibirDetalhes();
}
