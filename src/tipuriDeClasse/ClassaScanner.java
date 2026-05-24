package tipuriDeClasse;

import java.util.Scanner;

public class ClassaScanner {
    static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Introduceti numele: ");
        String name = object.nextLine();
        System.out.println("Numele: " + name);

        System.out.println("Introduceti virsta: ");
        int age = object.nextInt();
        System.out.println("Virsta: " + age);

        System.out.println("Introduceti temperatura de afara in orasul care locuiti: ");
        float temperature = object.nextFloat();
        System.out.println("Temperatura din oras: " +  temperature);

        /* Creati un program in care sa utilizati clasa Scanner si care sa
        intrebe utilizatorul numele sau si in ce oras locuieste, iar dupa ce
        utilizatorul introduce datele, programul ii returneaza o propozitie
        in care ii spune ca .. "Te numesti<XXXX> si locuiesti in orasul <XXXXX>"
        Exemplu:

        Introduceti numele: Diana
        Introduceti orasul: Zagreb

        Te numesti Diana si locuiesti in orasul Zagreb

         */
    }
}
