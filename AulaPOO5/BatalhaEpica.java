package AulaPOO5;

public class BatalhaEpica {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Bebeto", 1000);
        Inimigo i1 = new Inimigo("Romario", 750);

        j1.fraseApresentacao();
        i1.fraseApresentacao();
        j1.mostraVida();

        while (j1.estaVivo() && i1.estaVivo()) {
            i1.fazAtaque(j1);
            i1.mostraVida();
            i1.atacando();

            j1.fazAtaque(i1);
            j1.mostraVida();
            j1.atacando();
        }

        if (!j1.estaVivo()) {
            j1.fraseMorte();
        } else {
            i1.fraseMorte();

        }
    }
}