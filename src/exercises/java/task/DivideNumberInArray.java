package exercises.java.task;

import java.util.Arrays;


public class DivideNumberInArray {

    static int[] number1 = {1};
    static int[] number2 = {30};

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(divideArrays(number1,2,120)));
        System.out.println(Arrays.toString(calculateE(205023,1000007)));
    }

    public static int[] divideArrays(int[] Array1, int divider, int precision) {
        int[] result = new int[precision];
        int dividend = 0 ;
        for (int i = 0; i < result.length; i++) {
            dividend = i>=Array1.length ? dividend : dividend + Array1[i];
            result[i] = dividend / divider;
            dividend = (dividend-result[i]*divider) *10;
        }
        return result;
    }

    public static int[] addArrays(int[] arrayA, int[] arrayB) {
        int[] newArray = new int[arrayB.length];
        int carry = 0;

        for (int i = arrayB.length - 1; i >= 0; i--) {
            int arrayAValue = i>=arrayA.length ? 0 : arrayA[i];
            newArray[i] = carry + (arrayAValue + arrayB[i]);
            carry = newArray[i] / 10;
            newArray[i] = newArray[i] % 10;
        }

        return newArray;
    }

    public static int[] calculateE(int n, int precision) {
        int[] eNumber = new int[precision];
        Arrays.fill(eNumber, 0);
        int[] lastDivision = {1};
        eNumber[0] = 0;

        for (int i = 2; i < n; i++) {
            lastDivision = divideArrays(lastDivision,i,precision);
            eNumber = addArrays(eNumber,lastDivision);
        }

        return eNumber;
    }


}
