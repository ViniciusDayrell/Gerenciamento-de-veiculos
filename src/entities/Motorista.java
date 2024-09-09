package entities;

public class Motorista {
    private String nome;
    private int idade;
    private String cpf;
    private char categoriaCNH;

    public Motorista(String nome, int idade, String cpf, char categoriaCNH) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.categoriaCNH = categoriaCNH;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public char getCategoriaCNH() {
        return categoriaCNH;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Categoria: " + categoriaCNH;
    }

}
