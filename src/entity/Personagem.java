package entity;

public class Personagem {
    private long id;
    private String nome;
    private int idade;
    private String descricao;

    public Personagem() {
    }

    public Personagem(String nome, int idade, String descricao) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.descricao = descricao;
    }

    public Personagem(long id, String nome, int idade, String descricao) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.descricao = descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "\nid=" + id +
                ", \nnome='" + nome + '\'' +
                ", \nidade=" + idade +
                ", \ndescricao='" + descricao + '\'' +
                '}';
    }
}




