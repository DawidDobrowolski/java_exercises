package exercises.java.hackerrank;


import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CircularArrayRotation {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] newA = new int[a.length];
        if(k%a.length != 0) {
            int[] aBeginning = Arrays.copyOfRange(a, a.length - (k>a.length ? k % a.length : k), a.length);
            int[] aEnd = Arrays.copyOfRange(a, 0, a.length- (k>a.length ? k % a.length : k));
            System.arraycopy(aBeginning, 0, newA, 0, aBeginning.length);
            System.arraycopy(aEnd, 0, newA, aBeginning.length, aEnd.length);
        }else{
            newA = a;
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = newA[queries[i]];
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        int[] result = circularArrayRotation(a, k, queries);

        scanner.close();
    }
}
