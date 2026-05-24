package tipuriDeDate;

// Viteza luminii folosind long
public class Lumina {
    static void main(String[] args) {
        int vitezaLuminii;
        long zile;
        long secunde;
        long distanta;

        // Viteza aproximativa a luminii, in mile pe secunda
        vitezaLuminii = 186000;

        zile = 1000;

        secunde = zile * 24 * 60 * 60; // o formam in secunde
        distanta = vitezaLuminii * secunde;

        System.out.print("In "+zile);
        System.out.println(" zile lumina va inainta aproximativ ");
        System.out.println(distanta + " mile");
    }
}
