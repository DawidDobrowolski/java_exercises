package exercises.java.task;


import java.util.Scanner;
import java.util.stream.IntStream;

public class SemiEquilibrium {

    public static int getEquilibrium(int[] numbers){
        int sum = IntStream.of(numbers).sum();
        int position = -1;
        int temporarySum = 0;

        for (int i = 0; i < numbers.length; i++) {
            temporarySum += numbers[i];
            if(temporarySum > (double)(sum/2)){
                position = i;
                break;
            }
        }
        return position;
    }


    public static void main(String[] args) {

        System.out.println("Please enter number of elements in array");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Please enter your array");
        int[] numbers = new int[n];
        String[] numbersItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(numbersItems[i]);
            numbers[i] = arItem;
        }
        scanner.close();

        System.out.println("Semi-equilibrium position: " + getEquilibrium(numbers));
    }
}
