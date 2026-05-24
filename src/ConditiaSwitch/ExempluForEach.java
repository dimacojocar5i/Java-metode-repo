package ConditiaSwitch;

import java.util.ArrayList;
import java.util.List;

public class ExempluForEach {
    static void main(String[] args) {
        int [] numbers = new int [] {3, 2, 1 };
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Exemplu

        List<Integer> lists = new ArrayList<Integer>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        for (Integer value: lists){
            System.out.println(value);
        }
    }
}
