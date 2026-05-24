package metode;

public class ExempluElseIf {
    static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;

        if(num1 > num2) {
            System.out.println("Primul numar este mai mare ca al doilea");
        } else if(num1 < num2) {
            System.out.println("Primul numar este mai mic ca al doilea");
        } else {
            System.out.println("Numerele sunt egale");
        }
    }
}
