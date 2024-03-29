package exercises.java.hackerrank;


import java.io.IOException;
import java.util.Scanner;

public class SaveThePrisoner {

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {
        int shift = m%n-1;
        int result =0;
        if (shift + s > n){
            result = (shift+s)%n;
        }else if(shift + s == 0){
            result = n;
        }else{
            result = shift + s;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nms = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nms[0]);

            int m = Integer.parseInt(nms[1]);

            int s = Integer.parseInt(nms[2]);

            int result = saveThePrisoner(n, m, s);

        }

        scanner.close();
    }
}
