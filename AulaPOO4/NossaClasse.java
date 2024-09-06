package AulaPOO4;

public class NossaClasse {
    public int soma(int i1, int i2){
        return i1 + i2;
    }
    public int soma(double d1, double d2){
        return (int)d1 + (int)d2;
    }
    public int soma(int i1, double d2){
        return (int)i1 + (int)d2;
    }
    public int soma(double d1, int i2){
        return (int)d1 + (int) i2;
    }

    public void nossoMetodo(){
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Rodando lo metodo ");
    }
    public void nossoMetodo(int parametro){
        nossoMetodo();
        System.out.println("Recebiendo lo paramito " + parametro);
    }
    public void nossoMetodo(double parametro){
        nossoMetodo();
        System.out.println("Recebiendo lo paramito " + parametro);
    }
    public void nossoMetodo (double d1, int i1, float f1, String s, int i2){

    }
}

