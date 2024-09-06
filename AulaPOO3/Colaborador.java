package AulaPOO3;

public class Colaborador extends Pessoa{

    private int salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }


    public Colaborador(String nome, int idade, int salario) {
        super(nome, idade);
        this.salario = salario;

    }

    public void recebeSalario(){
        if (isMatricula()){
            System.out.println(getNome() + " recebe o salario de R$" + getSalario());
        }else{
            System.out.println("Colaborador desligado");
        }
    }

    @Override
    public String toString(){
        return "\nColaborador: " + getNome() + ", " + getIdade() + " anos de idade." + "\nValor de Salario:R$" + getSalario();
    }

}
