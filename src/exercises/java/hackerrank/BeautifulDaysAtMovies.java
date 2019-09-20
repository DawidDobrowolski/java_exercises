package exercises.java.hackerrank;


import java.io.IOException;
import java.util.Scanner;

public class BeautifulDaysAtMovies {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int reversedInt = 0;
        int counter = 0;

        for (int l = i; l <= j ; l++) {
            String numberString = String.valueOf(l);
            reversedInt = Integer.parseInt(reverse(numberString));
            if ((l - reversedInt)%k == 0){
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }

    private static String reverse(String number){
        if ((null == number) || (number.length() <= 1)) {
            return number;
        }
        return reverse(number.substring(1)) + number.charAt(0);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        scanner.close();
    }

}
