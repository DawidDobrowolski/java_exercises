package exercises.java.hackerrank;


import java.io.IOException;
import java.util.Scanner;

public class DesignerPDFViewer {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        int maxHeight = 0;
        char[] wordChars = word.toCharArray();

        for (int i = 0; i < wordChars.length; i++) {
            if(h[(int) wordChars[i] -97] > maxHeight){
                maxHeight = h[(int) wordChars[i] -97];
            }
        }
        return maxHeight*wordChars.length;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        scanner.close();
    }
}
