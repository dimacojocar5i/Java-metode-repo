package operatori;

public class OperatorTernar {
    static void main(String[] args) {
        // Exemplu if else
//        int age = 50;
//        if (age < 18) {
//            System.out.println("Esti copil");
//        } else {
//            System.out.println("Esti adult");
//        }

        // Acelasi exemplu cu utilizarea operatorului Ternar

        int age = 50;
        String response = (age < 18) ? "Esti copil" : "Esti adult";
        System.out.println(response);
    }
}
