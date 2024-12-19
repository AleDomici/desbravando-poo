/**
 * Classe que representa um livro na biblioteca.
 * Aplica os conceitos de encapsulamento e abstração
 */
public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean isDisponivel = true;

    /**
     *Construtor da classe livro
     *
     * @param titulo Titulo do livro
     * @param autor Autor do livro
     * @param isbn isbn Códio ISBN do livro
     */
    public Livro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    /**
     * Exibe os detalhes do livro
     * Demonstrando polimorfismo sobrescrever o método em potencial de uma superclasse.
     */
    public void exibirDetalhes(){
        System.out.println("Título: " +titulo);
        System.out.println("Autor: " +autor);
        System.out.println("ISBN: " +isbn);
        System.out.println("Disponível: " + (isDisponivel ? "Sim" : "Não"));
    }

    /**
     * Empresta o livro, alterando o seu status de disponibilidade.
     * Se o livro já estiver emprestado, exibe uma mensagem informando isso.
     */

    public void emprestar() {
        if (isDisponivel){
            isDisponivel = false;
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    /**
     * Devolve o livro, tornando-o novamente disponível.
     * Se o livro já estiver disponível, exibe uma mensagem informando isso.
     */

    public void devolver () {
        if(!isDisponivel) {
            isDisponivel = true;
            System.out.println("O livro foi devolvido com sucesso.");
        } else{
            System.out.println("O livro já está disponível");
        }
    }

    /**
     * Método getter para acessar a disponibilidade do livro.
     * @return true se o livro estiver disponível, false caso contrario
     */

    protected boolean isDisponivel() {
        return isDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
