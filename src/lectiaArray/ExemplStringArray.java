package LectiaArray;

public class ExemplStringArray {
    static void main(String[] args) {
        String [] cuvinte = new String[3];
        System.out.println(cuvinte[0] + " " + cuvinte[1] + " " + cuvinte[2]);
        cuvinte[0] = "One";
        cuvinte[1] = "Two";
        cuvinte[2] = "Three";
//        String x = cuvinte[0] + " " + cuvinte[1] + " " + cuvinte[2];
//        System.out.println(x);

        // Afisarea tabloului cu ajutorul ciclului for
        for (int i = 0; i < cuvinte.length; i++){
            System.out.println(cuvinte[i]);

        }

        // Afisarea tabloului cu ajutorul ciclului For Each
        for (String s : cuvinte) {
            System.out.println(s);
        }
    }
}
