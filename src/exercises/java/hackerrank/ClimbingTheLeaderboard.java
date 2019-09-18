package exercises.java.hackerrank;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ClimbingTheLeaderboard {


    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        Arrays.sort(scores);
        int[] scoresUnique = Arrays.stream(scores).distinct().toArray();
        int counter = 0;
        int startPoint = 0;
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < alice.length; i++) {
            for (int j = startPoint; j < scoresUnique.length ; j++) {
                if(alice[i] >= scoresUnique[j]){
                        counter++;
                }else{
                    startPoint = j;
                    break;
                }
            }
            results.add(scoresUnique.length + 1 - counter);
            counter = startPoint;
        }
        System.out.println(results.toString());
        return results.stream().mapToInt(i -> i).toArray();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        scanner.close();
    }
}
