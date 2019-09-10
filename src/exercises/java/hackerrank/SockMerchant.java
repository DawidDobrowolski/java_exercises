package exercises.java.hackerrank;


import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int counter = 1;
        int counterPairs = 0;
        Arrays.sort(ar);

        for (int i = 0; i < ar.length -1; i++) {
            if(ar[i]==ar[i+1]){
                counter++;
            }else {
                counterPairs += counter/2;
                counter = 1;
            }
            if(i == ar.length-2){
                counterPairs += counter/2;
            }
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(counterPairs);
        return counterPairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        scanner.close();
    }




}
