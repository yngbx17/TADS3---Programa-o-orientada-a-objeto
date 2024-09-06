package AulaPOO3;

public class Aluno extends Pessoa{
    private String nome;
    private int idade;
    private int id;
    private int precoCurso;

    public int getPrecoCurso() {
        return precoCurso;
    }

    public void setPrecoCurso(int precoCurso) {
        this.precoCurso = precoCurso;
    }

    public Aluno( String nome, int idade, int id, String curso, int precoCurso) {
        super(nome, idade);
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.curso = curso;
        this.precoCurso = precoCurso;
    }


    public void pagaMensalidade(){
        if(isMatricula()){
            System.out.println("Aluno " + getNome() + " com o ID:" + getId() + " atualmente cursa " + getCurso() + " no valor de:R$ " + getPrecoCurso());
        }else if (precoCurso == 0){
            System.out.println("Aluno bolsista, portanto isento de mensalidade");
        }else{
            System.out.println("Aluno não encontrado");
        }
    }
    public String toString(){
        return "\nAluno: " + getNome() + "\nIdade: " + getIdade() + "\nID: " + getId() + "\nCurso: " + getCurso();
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    private String curso;

}
