package exercises.java.hackerrank;


import java.io.IOException;
import java.util.Scanner;

public class FindDigits {


    // Complete the findDigits function below.
    static int findDigits(int n) {
        char[] nCharArray = String.valueOf(n).toCharArray();
        int digit = 0;
        int result = 0;

        for (int i = 0; i < nCharArray.length; i++) {
            digit = Integer.parseInt(String.valueOf(nCharArray[i]));
            if (digit != 0 && n%digit == 0){
                result++;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

        }

        scanner.close();
    }


}
