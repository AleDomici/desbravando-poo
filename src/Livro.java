public class Livro {
    String titulo;
    String autor;
    String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }
}
