package exercises.java.hackerrank;


import java.io.*;

public class DayOfTheProgrammer {


    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        String result;

        if(year < 1918){
            if(year%4 == 0){
                result = "12.09." + year;
            }else{
                result = "13.09." + year;
            }
        }else if(year>1918){
            if(year%4 == 0 && year%100 !=0 || year%400 == 0){
                result = "12.09." + year;
            }else{
                result = "13.09." + year;
            }
        }else{
            result = "26.09.1918";
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedReader.close();
    }


}
