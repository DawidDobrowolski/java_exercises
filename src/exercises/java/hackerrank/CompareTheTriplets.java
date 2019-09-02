package exercises.java.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    // compare results of two game players

    public static void main(String[] args) {
        List<Integer> aScore = new ArrayList<>();
        List<Integer> bScore = new ArrayList<>();
        aScore.addAll(Arrays.asList(0, 0, 0));
        bScore.addAll(Arrays.asList(3, 2, 1));

        System.out.println(compareTriplets(aScore, bScore));

    }


    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        result.add(0); //result a
        result.add(0); //result b
        for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
            if (a.get(i) > b.get(i)) {
                result.set(0, result.get(0) + 1);
            } else if (a.get(i) < b.get(i)) {
                result.set(1, result.get(1) + 1);
            }
        }
        return result;
    }

}
