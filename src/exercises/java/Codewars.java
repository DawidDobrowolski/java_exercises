package exercises.java;


public class Codewars {

    public static void main(String[] args) {

        System.out.println(squareDigits(909));

    }


    // square every digit of a number

    public static int squareDigits(int n) {
        StringBuilder sb = new StringBuilder();
        String nString = String.valueOf(n);
        char[] nArray = nString.toCharArray();
        for (int i = 0; i < nArray.length; i++) {
            sb.append((int) Math.pow(Integer.parseInt(String.valueOf(nArray[i])), 2));
        }
        return Integer.parseInt(sb.toString());
    }

}
