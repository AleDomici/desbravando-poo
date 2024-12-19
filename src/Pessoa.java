import java.sql.SQLOutput;

public abstract class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    public abstract void exibirDetalhes();
}
