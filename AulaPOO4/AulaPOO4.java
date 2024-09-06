package AulaPOO4;

public class AulaPOO4 {
    public static void main(String[] args ) {
        NossaClasse nossoObjeto = new NossaSubClasse();
        nossoObjeto.nossoMetodo();

        int soma = nossoObjeto.soma(2 , 4.5);
        System.out.println(soma);
    }
}

