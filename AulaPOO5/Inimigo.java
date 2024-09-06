package AulaPOO5;

public class Inimigo extends Criatura {

    private int ataque = 50;

    public Inimigo(String nome, int vida) {
        super(nome,vida);
    }

    @Override
    public void fazAtaque(Criatura atacado) {
        atacado.tomaDano(this.ataque);

    }

    @Override
    public void fraseApresentacao() {
        System.out.println(this.nome + ": Eu vou te matar seu virgem!!!!!");

    }

    @Override
    public void fraseMorte() {
        System.out.println(this.nome + ": Naaaaaaaaaaaaaaaaao eu faleci!!!!");

    }

    @Override
    public void atacando() {
        System.out.println("\n" + "Inimigo atacou e deu " + ataque + " de dano");
    }

}
