package exercises.java.task;


import java.util.Arrays;

public class EVAL {

    public static void main(String[] args) {
        int[] result = calculateE(50, new int[51]);
        System.out.println("2." + Arrays.toString(result).replace(", ", "").replace("]", "").substring(2));
    }


    public static int[] calculateE(int n, int[] d) {
        d[0] = 2;
        int m = calculateM(n);
            int[] coef = new int[m + 2];
            Arrays.fill(coef, 1);
            for (int i = 1; i <= n; i++) {
                int carry = calculateCarry(0, m, coef, 0);
                d[i] = carry;
            }
        return d;
    }

    private static int recursionCarry(int carry, int m, int[] coef, int temp) {
        if (m >= 2) {
            temp = coef[m] * 10 + carry;
            carry = temp / m;
            coef[m] = temp - carry * m;
            return recursionCarry(carry, m - 1, coef, temp);
        }
        return carry;
    }

    private static int calculateCarry(int carry, int m, int[] coef, int temp) {
        for (int i = m; i >=2 ; i--) {
            temp = coef[i] * 10 + carry;
            carry = temp / i;
            coef[i] = temp - carry * i;
        }
        return carry;
    }


    public static int calculateM(int n){
        int m =4;
        while (m * (Math.log(m) - 1.0) + 0.5 * Math.log(6.2831852 * m) <= (n + 1) * 2.30258509){
            m++;
        }
        return m;
    }


}
