package exercises.java;

import javafx.scene.web.HTMLEditorSkin;

import java.util.Scanner;

public class DataType {

    public static void main(String[] args) {

        //byte

        byte byteMin = Byte.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;

        System.out.println("byte is between " + byteMin + " and " + byteMax);

        
        //short

        short shortMin = Short.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;

        System.out.println("short is between " + shortMin + " and " + shortMax);


        //int

        int intMin = Integer.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;

        System.out.println("int is between " + intMin + " and " + intMax);

        
        //long

        long longMin = Long.MIN_VALUE;
        long longMax = Long.MAX_VALUE;

        System.out.println("long is between " + longMin + " and " + longMax);

        long longValue = 2147483648L; //more then int value

        //float

        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;

        System.out.println("float is between " + floatMin + " and " + floatMax);


        //double

        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;

        System.out.println("double is between " + doubleMin + " and " + doubleMax);


        //example
        int intValue = 7 / 3;
        float floatValue = 7f / 3f;
        double doubleValue = 7.00 / 3d; //default format

        System.out.println("int: " + intValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);

        //overflow and underflow

        int intUnderflow = intMin - 1;
        int intOverflow = intMax + 1;

        System.out.println("underflow of int: " + intUnderflow);
        System.out.println("overflow of int: " + intOverflow);


        //casting

        byte byteTest = (byte) (byteMax/2);     //default number is int
        short shortTest = (short) (shortMax/2);
        int intTest = intMax/2;
        long longTest = longMax/2;


        //example
        byte byteExample = 12;
        short shortExample = 1842;
        int intExample = 32_767_213;
        long longExample = 500_000L + 10L * (byteExample + shortExample + intExample); //automatic casting
        System.out.println(longExample);


        //pounds to kilograms converter

        System.out.println("Please enter number of pounds");
        Scanner scanner = new Scanner(System.in);
        double pounds = scanner.nextDouble();
        double kilograms = pounds * 0.453_592_37d;
        System.out.println(pounds + " pounds = " + kilograms);




    }


}
