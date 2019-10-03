package exercises.java.task;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EVAL {

    public static void main(String[] args) {
        int[] result = calculateE(1000, new int[1001]);
        System.out.println("2." + Arrays.toString(result).replace(", ", "").replace("]", "").substring(2));
    }


    public static int[] calculateE(int n, int[] d) {
        d[0] = 2;
        for (int m = 4; (m * (Math.log(m) - 1.0) + 0.5 * Math.log(6.2831852 * m) <= (n + 1) * 2.30258509); m++) {
            Map<Integer, Integer> coefMap = new HashMap<>();
            int[] coef = new int[m + 2];
            Arrays.fill(coef, 1);
            for (int i = 1; i <= n; i++) {
                String coefString = Arrays.toString(coef);
                    if(!coefMap.containsKey(coefString.hashCode())){
                        int carry = recursionCarry(0, m, coef, 0);
                        coefMap.put(coefString.hashCode(),carry);
                        d[i] = carry;
                    }else{
                        d[i] = coefMap.get(coefString.hashCode());
                    }
            }
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
}
