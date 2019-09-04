package exercises.java.hackerrank;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {


    /*
     * Complete the timeConversion function below.
     */
    //Solution
    static String timeConversion(String s) {
        String dayPart = s.substring(s.length()-2);
        String hours = s.substring(0,2);
        String newTime;

        if(dayPart.equals("PM")){
            if (hours.equals("12")){
                newTime = s.substring(0,s.length()-2);
            }else{
                newTime = s.substring(0,s.length()-2).replace(hours,Integer.parseInt(hours) + 12 +"");

            }
        }else{
            if (hours.equals("12")){
                newTime = s.substring(0,s.length()-2).replace(hours,"00");
            }else{
                newTime = s.substring(0,s.length()-2);
            }
        }
        return newTime;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }

}
