
public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean isDisponivel;

    public Livro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.isDisponivel = true;
    }
    public void exibirDetalhes(){
        System.out.println("Título: " +titulo);
        System.out.println("Autor: " +autor);
        System.out.println("ISBN: " +isbn);
        System.out.println("Disponível: " + (isDisponivel ? "Sim" : "Não"));
    }

    public void emprestar() {
        if (isDisponivel){
            isDisponivel = false;
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    public void devolver () {
        if(!isDisponivel) {
            isDisponivel = true;
            System.out.println("O livro foi devolvido com sucesso.");
        } else{
            System.out.println("O livro já está disponível");
        }
    }

    private boolean isDisponivel() {
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
