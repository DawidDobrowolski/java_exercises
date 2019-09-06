package exercises.java.hackerrank;


import java.io.IOException;
import java.util.Scanner;

public class BreakingtheRecords {

    // Complete the breakingRecords function below.
    // Solution
    static int[] breakingRecords(int[] scores) {
        int maxValue = scores[0];
        int minValue = scores[0];
        int minCounter = 0;
        int maxCounter = 0;

        for (int i = 1; i < scores.length; i++) {
            if(scores[i] > maxValue){
                maxValue = scores[i];
                maxCounter++;
            }
            if(scores[i] < minValue){
                minValue = scores[i];
                minCounter++;
            }
        }
        int[] result = {maxCounter, minCounter};
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);


        scanner.close();
    }




}
