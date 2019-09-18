package exercises.java.task;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IpAddress {

    public static List<String> ips = new ArrayList<>();
    public static List<String> result = new ArrayList<>();


    public static List<String> ipOptions(List<String> textList, int start) {
        for (String text : textList.toArray(new String[textList.size()])) {
            if (start < text.length() && text.charAt(start) != '.') {
                if (text.chars().filter(ch -> ch == '.').count() == 2) {
                    result.add(text.substring(0, start) + "." + text.substring(start));
                }
                ips.add(text.substring(0, start) + "." + text.substring(start));
                ipOptions(new ArrayList<String>() {{
                    add(text);
                }}, start + 1);
            }
        }
        return ips;
    }


    public static void main(String[] args) {

        System.out.println("Please enter expression to check");

        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        ipOptions(ipOptions(ipOptions(new ArrayList<String>() {{add(text);}}, 3), 2), 1);

        System.out.println("Number of possible IP numbers: " + result.size());
        System.out.println(result.toString());
    }

}
