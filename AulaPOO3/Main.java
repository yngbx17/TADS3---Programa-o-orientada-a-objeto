package AulaPOO3;

import AulaPOO3.Colaborador;
import AulaPOO3.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Jonathan Calleri", 30);
        System.out.println(p1.toString());

        Colaborador c1 = new Colaborador("Lucas Moura", 32, 5000);
        System.out.println(c1.toString());
        c1.recebeSalario();
        c1.ativaMatricula();
        c1.recebeSalario();

        Aluno a1 = new Aluno("Diegolas", 18 , 11009, "Psicologia" , 670);
        System.out.println(a1.toString());
        a1.pagaMensalidade();
        a1.ativaMatricula();
        a1.pagaMensalidade();

        Aluno a2 = new Aluno("Bobby Charlton", 19, 12040, "Artes cênicas", 0);
        System.out.println(a2.toString());
        a2.pagaMensalidade();
        a2.ativaMatricula();
        a2.pagaMensalidade();



    }

}
