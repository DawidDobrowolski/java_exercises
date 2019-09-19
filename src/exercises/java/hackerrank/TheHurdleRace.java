package exercises.java.hackerrank;


import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TheHurdleRace {


    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
        Arrays.sort(height);
        int result = k < height[height.length-1] ? height[height.length-1] - k : 0;
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] height = new int[n];

        String[] heightItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightItems[i]);
            height[i] = heightItem;
        }

        int result = hurdleRace(k, height);

        scanner.close();
    }
}
