package exercises.java.hackerrank;


import javax.lang.model.element.Element;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class SequenceEquation {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        List<Integer> pList = new ArrayList<>();
        for (int number:p) {
            pList.add(number);
        }
        for (int i = 0; i < p.length; i++) {
            result[i] = pList.indexOf(pList.indexOf(i+1) +1) + 1;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

        scanner.close();
    }
}
