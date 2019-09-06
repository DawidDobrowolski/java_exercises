package exercises.java.hackerrank;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BetweenTwoSets {


    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
    // Solution
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        List<Integer> numbers = new ArrayList<>();
        boolean isDivisible = false;
        int result = 0;
        b = b.stream()
                .sorted((i1, i2) -> i1.compareTo(i2))
                .collect(Collectors.toList());
        for (int i = a.get(a.size() - 1); i <= b.get(0); i++) {
            for (Integer aNumber : a) {
                if (i % aNumber == 0) {
                    isDivisible = true;
                } else {
                    isDivisible = false;
                    break;
                }
            }
            if (isDivisible) {
                numbers.add(i);
            }
            isDivisible = false;
        }
        for (Integer number : numbers) {
            for (Integer bNumber : b) {
                if (bNumber % number == 0) {
                    isDivisible = true;
                } else {
                    isDivisible = false;
                    break;
                }
            }
            if (isDivisible) {
                result++;
            }
            isDivisible = false;
        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = getTotalX(arr, brr);

//        bufferedWriter.write(String.valueOf(total));
//        bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
