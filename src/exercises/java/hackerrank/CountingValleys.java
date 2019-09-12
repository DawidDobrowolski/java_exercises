package exercises.java.hackerrank;


import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int level = 0;
        int valleyNumbers = 0;

        char[] steps = s.toCharArray();

        for (int i = 0; i < steps.length; i++) {
            if(steps[i] == 'U'){
                level++;
               if(level == 0){
                   valleyNumbers ++;
               }
            }else{
                level--;
            }
        }
        return valleyNumbers;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        scanner.close();
    }


}
