package AulaPOO5;

import java.util.Random;
import java.util.Scanner;
public class Jogador extends Criatura {

    private int ataqueForte = 140;
    private int ataqueFraco = 40;



    public Jogador(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void fazAtaque(Criatura atacado) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEscolha sua arma: ");
        System.out.println("1 - Glock: 40 de Dano - Risco 0%");
        System.out.println("2 - AWP: 140 - Risco 50%");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                atacado.tomaDano(this.ataqueFraco);
                System.out.println("Voce atacou fraco");
                break;

            case 2:
                int sorteio = r.nextInt(2);
                if (sorteio == 1) {
                    atacado.tomaDano(this.ataqueForte);
                    System.out.println("Golpe Critico");


                } else {
                    System.out.println("Perdeu o ataque trouxa");
                }
                break;
        }

    }

    @Override
    public void fraseApresentacao() {
        System.out.println(this.nome + ": Prepare se para morrer filho da puta ");

    }

    @Override
    public void fraseMorte() {
        System.out.println(this.nome + ": Mamou otario");
    }

    @Override
    public void atacando() {
        System.out.println("Voce atacou");
    }

}

