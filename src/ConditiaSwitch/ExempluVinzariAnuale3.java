package ConditiaSwitch;

import java.util.Scanner;

public class ExempluVinzariAnuale3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lunaIntrodusa;
        int vinzariTotale = 0;
        for (int i = 0; i < 12; i++) {

            System.out.print("Introduceti luna " + ( i + 1) + ": ");
            lunaIntrodusa = scanner.nextInt();

            vinzariTotale = vinzariTotale + lunaIntrodusa;
        }

        System.out.println(vinzariTotale);

    }
}
