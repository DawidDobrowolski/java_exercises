package exercises.java.hackerrank;


import java.io.IOException;
import java.util.Scanner;

public class ViralAdvertising {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        int likesNumber = 2;
        int sumLikesNumber = 2;
        for (int i = 2; i <= n; i++) {
            likesNumber = (int) Math.floor(likesNumber*3/2);
            sumLikesNumber += likesNumber;
        }
        return sumLikesNumber;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

        scanner.close();
    }
}
