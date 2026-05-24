package ConditiaSwitch;

public class BuclaWihle {
    static void main(String[] args) {
        // Bucla WHILE se va executa atita timp
        // cit este adevarata.

//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }
    int n = 10;
    while (n > 0) {
        System.out.println("secunda " + n);
        n--;
    }
   int a = 10, b = 50;
    // nu avem nevoie de acolade daca nu avem mai mult de un cimp dar se recomanda de le pus.
    while (a > b)
        System.out.println("Asta nu va fi executata niciodata ca este falsa");

    }
}
