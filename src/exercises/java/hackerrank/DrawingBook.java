package exercises.java.hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class DrawingBook {


    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int frontSite = p/2;
        int backSite = n%2 == 0 ? (n-p+1)/2  : (n-p)/2;

        return Math.min(frontSite,backSite);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        scanner.close();
    }
}
