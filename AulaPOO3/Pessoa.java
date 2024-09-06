package AulaPOO3;

public class Pessoa {
    private String nome;
    private int idade;
    private boolean matriculado = false;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("\nPessoa criada com sucesso");
    }
    public void ativaMatricula(){
        this.matriculado = true;
    }

    public boolean isMatricula(){
        return this.matriculado;
    }
    @Override
    public String toString(){
        return "\nPessoa: " + getNome() + ", " + getIdade() + " anos de idade.";
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

}
