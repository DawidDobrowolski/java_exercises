package exercises.java.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PickingNumbers {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        List<Integer> result = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < a.size(); i++) {
            for (int j = i; j < a.size(); j++) {
                if(a.get(i)+1 >= a.get(j)){
                    counter ++;
                }else{
                    result.add(counter);
                    counter = 0;
                    break;
                }
            }
            result.add(counter);
            counter = 0;
        }
        return Collections.max(result);
    }



    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = pickingNumbers(a);

        bufferedReader.close();
    }
}
