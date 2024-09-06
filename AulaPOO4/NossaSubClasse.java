package AulaPOO4;

public class NossaSubClasse extends NossaClasse{
    @Override
    public void nossoMetodo(){
        super.nossoMetodo();
        System.out.println("Rodando lo metodo la partira pela subclassique");
    }
    @Override
    public void nossoMetodo(int parametro){
        super.nossoMetodo(parametro);
        System.out.println("Estamos en la subclassique");
    }
    @Override
    public void nossoMetodo(double parametro){
        nossoMetodo();
        System.out.println("Recebiendo lo primerito doublete " + parametro);

    }
}