package ConditiaSwitch;

public class ExempluSwitch {
    static void main(String[] args) {
        int numar = 44;
        String marime;
        // Instructiunea switch pentru verificarea conditiilor
        switch (numar) {
            case 29:
                marime = "Mic";
                break;
            case 42:
                marime = "Mediu";
                break;
              // Potrivirea valorii
            case 44:
                marime = "Larg";
                break;

            case 48:
                marime = "Extra larg";
                break;

            default:
                marime = "Necunoscut";
                break;
        }
        System.out.println("Marimea: " + marime);
    }
}
