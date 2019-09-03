package exercises.java.hackerrank;


import java.util.Scanner;

public class Staircase {



    // Complete the staircase function below.
    static void staircase(int n) {
        String line = "";
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                line = line.concat(" ");
            }
            for (int j = 1; j <= i; j++) {
                line = line.concat("#");
            }
            System.out.println(line);
            line="";
        }
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
