package AulaPOO5;

public abstract class Criatura {

    public String nome;
    public int vida;

    public Criatura(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public abstract void fraseApresentacao();

    public abstract void fraseMorte();

    public abstract void fazAtaque(Criatura atacado);

    public abstract void atacando();

    public boolean estaVivo() {
        return (this.vida > 0);
    }

    public void tomaDano(int dano) {

        if (dano > this.vida) {
            this.vida = 0;
        } else {
            this.vida -= dano;
        }
    }

    public void mostraVida() {
        System.out.println("\n" + this.nome + ": Vida = " + this.vida);
    }

}
