package AulaPOO4.pt2;

public class NossaClasseAbstrata implements NossaInterface{

    int atributo1;
    int atributo2;

    public NossaClasseAbstrata(int a1, int a2) {
        this.atributo1 = a1;
        this.atributo2 = a2;
    }

    public int getAtributo1() {
        return atributo1;
    }

    public int getAtributo2() {
        return atributo2;
    }
    public void metodo1(){
        System.out.println("MÉTODO UNO");
    }

    @Override
    public int metodo2(String s) {
        return 0;
    }

    @Override
    public float metodo3(int i) {
        return 0;
    }

    @Override
    public double metodo4(String s) {
        return 0;
    }

    @Override
    public String metodo5(int i1, int i2, int i3) {
        return null;
    }

    @Override
    public void metodo6() {

    }

    @Override
    public int metodo7(float f) {
        return 0;
    }

}