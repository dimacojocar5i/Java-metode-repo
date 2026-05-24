package LectiaArray;

public class ExempluPDFArray {
        public static void main(String[] args) {

            int [] numbers = new int[5];

            for(int i = 0; i < numbers.length; i++) {
                numbers[i] = i * 10;  // initializeaza tabloul
            }

            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]); // afiseaza tabloul
            }


        }

}
