package tipuriDeDate;

public class DemonstrareaLuiBoolean {
    public static void main(String[] args){
        boolean b;

        b = false;
        System.out.println("b este "+b);
        b = true;
        System.out.println("b este "+b);

        // o valoare booleana poate controla instructiunea if
        if(b) System.out.println("Asta va fi executat.");

        b = false;
        if(b) System.out.println("Asta nu va fi executat.");
        /*rezultatul de mai jos o sa vedeti ca este reprezentat
        printr-o valoare booleana*/
        System.out.println("10>9 este "+(10>9));

    }
}
