package metode;

public class ExempluCuIfSiElse {
    static void main(String[] args) {
        if (100 < 50) {
            // Acest bloc de cod va fi executat numai daca
            // conditiia (100 > 50) va fi adevarata
            System.out.println("100 mai mare ca 50"); // Actiunea 1
        } else {
            System.out.println("Ma executat pentruca aceasta conditie este false"); //Actiunea 2
        }
    }
}
