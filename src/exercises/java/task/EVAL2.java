package exercises.java.task;

import java.util.Arrays;

public class EVAL2 {



        static int[] aTable = {1, 2, 3, 5, 6, 5, 3, 4, 9};
        static int[] bTable = {6, 9, 4, 0, 4, 9};
        static int[] bbTable = {1, 1, 1, 1, 1, 1};
        static int[] cTable = {6, 4, 0, 2, 3, 7, 3, 7, 0, 5, 7, 2, 8, 0, 0, 0};
        static long[] dTable = {3,3,3};
        static long[] zTable = {1,0};
        static int[] eTable = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 1, 5, 5, 1, 1, 2, 1, 0, 0, 4, 3, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        static int[] fTable = {1};
        static int[] gTable = {2};

        public static void main(String[] args) {
//        System.out.println(Arrays.toString(multiply(zTable, dTable)));
//        System.out.println(Arrays.toString(divide(eTable, 40)));
//        System.out.println(Arrays.toString(divide(dTable, 100)));
            System.out.println(Arrays.toString(calculateE(220, 400)));

        }


        public static int[] multiply(int[] arrayA, int[] arrayB) {
//        System.out.println("A: " + Arrays.toString(arrayA));
//        System.out.println("B: " + Arrays.toString(arrayB));
            int[] result = new int[arrayA.length + arrayB.length];
            int carry = 0;
            Arrays.fill(result, 0);
            for (int i = arrayB.length - 1; i >= 0; i--) {
                carry = 0;
                for (int j = arrayA.length - 1; j >= 0; j--) {
                    if((arrayA[j] == 0 || arrayB[i] == 0) && carry ==0 ){
                        continue;
                    }else {
                        result[i + j + 1] += carry + arrayA[j] * arrayB[i];
                        carry = result[i + j + 1] / 10;
                        result[i + j + 1] = result[i + j + 1] % 10;
                    }
                }
                result[i] += carry;
            }
//        int frontZero = 0;
//        for (int i = 0; i < result.length; i++) {
//            if (result[i] == 0) {
//                frontZero++;
//            }else{
//                break;
//            }
//        }
            if(result[arrayA.length]>4){
                result[arrayA.length-1]+=1;
            }
//        System.out.println("Mnozenie, nie ucieta: " + Arrays.toString(result));
            result = Arrays.copyOfRange(result, 0, arrayA.length);
//        System.out.println("Mnozenie, ucieta: " + Arrays.toString(result));

            return result;
        }


        public static int[] divide(int[] array, int precision) {
            int[] result = new int[precision];
            Arrays.fill(result, 0);
            int dividend = 1;
            int zeroNumber = 0;
//        for (int i = array.length - 1; i >= 0; i--) {
//            if (array[i] == 0) {
//                zeroNumber++;
//            } else {
//                break;
//            }
//        }
            int longLength = array.length - zeroNumber;
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < longLength; i++) {
//            if (sb.length() < 18) {
                sb.append(array[i]);
//            } else {
//                zeroNumber++;
//            }
            }
            int divisor = Integer.parseInt(sb.toString());
            for (int i = zeroNumber; i < result.length; i++) {
                if (dividend < divisor) {
                    dividend *= 10;
                }
                result[i] = dividend / divisor;
                dividend -= divisor * result[i];
            }

//        int zeroBack = 0;
//        for (int i = result.length-1; i >= 0; i--) {
//            if(result[i] == 0 ){
//                zeroBack++;
//            }else{
//                break;
//            }
//        }
//        result = Arrays.copyOfRange(result, 0, result.length-zeroBack);

//        System.out.println("dzielenie: " + Arrays.toString(result) );
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
            int[] lastDivision = {5};
            eNumber[0] = 5;

            for (int i = 3; i < n; i++) {
                lastDivision = multiply(divide(getNumberArray(i),precision),lastDivision);
                eNumber = addArrays(eNumber, lastDivision);
//            System.out.println("lastDivision: " + Arrays.toString(lastDivision));
//            System.out.println("eNumber: " + Arrays.toString(eNumber));
            }

            return eNumber;
        }

        public static int[] getNumberArray(int i) {
            String iNumber = String.valueOf(i);
            int[] numberArray = new int[iNumber.length()];
            for (int j = 0; j < iNumber.length(); j++) {
                numberArray[j] = iNumber.charAt(j) - 48;
            }
            return numberArray;
        }



    }
