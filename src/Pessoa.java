import java.sql.SQLOutput;

public class Pessoa {
    protected String nome;
    public Pessoa(String nome) {
        this.nome = nome;
    }
    public void exibirDetalhe(){
        System.out.println("Nome: " + nome);
    }
}
