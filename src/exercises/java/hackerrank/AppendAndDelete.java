package exercises.java.hackerrank;


import java.io.IOException;
import java.util.Scanner;

public class AppendAndDelete {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        int maxCommon = 0;
        int changes = 0;
        String commonString ="";
        String result;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= s.length()-i; j++) {
                if(t.contains(s.substring(i, i+j))){
                    if (maxCommon < s.substring(i, i+j).length()){
                        maxCommon = s.substring(i, i+j).length();
                        commonString = s.substring(i, i+j);
                    }
                }
            }
        }
        changes = (s.length() - maxCommon) + (t.length()-maxCommon);
        if (changes == k || (changes < k &&  s.indexOf(commonString) == 0  && (k-changes)%2 == 0)  || (Math.max(s.length(),t.length())<k && changes%2 == 0) ){
            result = "Yes";
        }else {
            result = "No";
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        scanner.close();
    }
}
