package exercises.java.hackerrank;


import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                countPositive++;
            }else if(arr[i]<0){
                countNegative++;
            }else{
                countZero++;
            }
        }
        DecimalFormat df = new DecimalFormat("#0.######");
        System.out.println(String.format("%.6f",(Math.round(1000000d*countPositive/arr.length)/1000000d)));
        System.out.println(String.format("%.6f",(Math.round(1000000d*countNegative/arr.length)/1000000d)));
        System.out.println(String.format("%.6f",(Math.round(1000000d*countZero/arr.length)/1000000d)));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
