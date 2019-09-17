package exercises.java.hackerrank;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FormingMagicSquare {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        int result = 100;
        int currentSum = 0;
        int counter = 0;
        int[] array = new int[s.length * s[0].length];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                array[counter] = s[i][j];
                counter++;
            }
        }
        int [][] possibleArrays = {{8, 1, 6, 3, 5, 7, 4, 9, 2},
                {6, 1, 8, 7, 5, 3, 2, 9, 4},
                {4, 9, 2, 3, 5, 7, 8, 1, 6},
                {2, 9, 4, 7, 5, 3, 6, 1, 8},
                {8, 3, 4, 1, 5, 9, 6, 7, 2},
                {4, 3, 8, 9, 5, 1, 2, 7, 6},
                {6, 7, 2, 1, 5, 9, 8, 3, 4},
                {2, 7, 6, 9, 5, 1, 4, 3, 8}};

        for (int i = 0; i < possibleArrays.length; i++) {
            for (int j = 0; j < array.length; j++) {
                currentSum += Math.abs(possibleArrays[i][j] - array[j]);
            }
            if(currentSum < result){
                result  = currentSum;
            }
            currentSum = 0;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        scanner.close();
    }



}
