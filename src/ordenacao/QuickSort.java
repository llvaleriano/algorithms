package ordenacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    private static int it = 0;

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(new Integer[] {9,8,7,6,5,4,3,2,1});
        List<Integer> sorted = sort(values);

        printList(values);
        printList(sorted);
    }



    private static List<Integer> sort(List<Integer> values) {
        if (values.size() < 2) {
            return values;
        }

        int pivo = values.get(0);
        List<Integer> menores = new ArrayList<Integer>();
        List<Integer> maiores = new ArrayList<Integer>();

        for (int i = 1; i<values.size(); i++) {
            System.out.println("Iteração " + ++it);
            if (values.get(i) < pivo) {
                menores.add(values.get(i));
            } else {
                maiores.add(values.get(i));
            }
        }

        List<Integer> result = new ArrayList<Integer>();
        result.addAll(sort(menores));
        result.add(pivo);
        result.addAll(sort(maiores));
        return result;
    }


    private static void printList(List<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + ", ");
        }
        System.out.println("");
    }
}
