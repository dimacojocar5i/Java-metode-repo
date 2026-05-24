package LectiaArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExempluAraays {
    static void main(String[] args) {
       // int [] numbers = new int[6];

        int [] numbers = {100,200,300,400,500};
        System.out.println(Arrays.toString(numbers));

        String[] culori = {"Albastru", "Verde", "Galben"};
        System.out.println(Arrays.toString(culori));
        culori[2] = "Portocaliu";
        System.out.println(Arrays.toString(culori));
        System.out.println(culori.length);
        System.out.println(culori[2]);

    }
}
