package exercises.java.task;

import java.util.Arrays;

public class EVAL2 {

    public static void main(String[] args) {
        System.out.println("2." + Arrays.toString(combineResultsThreadN(26206, 7602)).replace(", ", "").replace("]", "").substring(2));
    }

    public static int[] divideArrays(int[] Array1, int divider, int precision) {
        int[] result = new int[precision];
        int dividend = 0;
        for (int i = 0; i < result.length; i++) {
            dividend = i >= Array1.length ? dividend : dividend + Array1[i];
            result[i] = dividend / divider;
            dividend = (dividend - result[i] * divider) * 10;
        }
        return result;
    }

    public static int[] addArrays(int[] arrayA, int[] arrayB) {
        int[] newArray = new int[arrayB.length];
        int carry = 0;
        for (int i = arrayA.length - 1; i >= 0; i--) {
            newArray[i] = carry + (arrayA[i] + arrayB[i]);
            carry = newArray[i] / 10;
            newArray[i] = newArray[i] % 10;
        }
        return newArray;
    }


    public static int[] combineResultsThreadN(int precision, int nIteration) {
        int[] eNumber = new int[precision];
        int[] lastDivision = {1};
        for (int i = 2; i < nIteration; i++) {
            lastDivision = divideArrays(lastDivision, i, precision);
            eNumber = addArrays(eNumber, lastDivision);
        }
        return eNumber;
    }


}
