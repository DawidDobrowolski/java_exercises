package exercises.java.task;

import java.util.Scanner;

public class BracketsControl {

    public static boolean bracketsCheck(String text) {
        char[] textElements = text.toCharArray();
        int counter = 0;

        for (int i = 0; i < textElements.length; i++) {
            if (textElements[i] == '(') {
                counter++;
            } else if (textElements[i] == ')') {
                counter--;
            }
            if (counter < 0) {
                return false;
            }
        }

        if (counter == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("Please enter expression to check");

        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        System.out.println("Brackets control result: " + bracketsCheck(text));
    }
}
