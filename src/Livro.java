
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

    public void emprestar() {
        if (disponivel){
            disponivel= false;
        }
    }

    public void devolver () {
        disponivel = true;
    }
    public boolean isDisponivel(){
        return disponivel;
    }

    public void exibirDetalhes(){
        System.out.println("Título: " +titulo + "Autor: " +autor + "ISBN: " +isbn + "Disponibilidade: " +disponivel);
    }
}
