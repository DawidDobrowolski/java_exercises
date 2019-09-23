package exercises.java.hackerrank;


import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class JumpingOnClouds {


    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int result = 100;
        int[] cNew = Arrays.copyOf(c,c.length+1);
        cNew[c.length] = c[0];
        int i = 0;

        while(i!= cNew.length-1){
            if(cNew[i+k] == 0){
                result -= 1;
            }else{
                result -= 3;
            }
            if (i+k> cNew.length-1){
                i = i+k - cNew.length +1;
            }else{
                i += k;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);

        scanner.close();
    }
}
