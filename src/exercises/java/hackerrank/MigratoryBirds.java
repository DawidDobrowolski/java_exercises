package exercises.java.hackerrank;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MigratoryBirds {


    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int topBird = 0;
        int counter = 0;
        int finalCounter = 0;

        Collections.sort(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) == arr.get(i + 1)) {
                counter++;
            } else {
                if (counter > finalCounter) {
                    finalCounter = counter;
                    topBird = arr.get(i);
                    counter = 0;
                }
            }
            if (i == arr.size() - 2) {
                if (counter > finalCounter) {
                    topBird = arr.get(i);
                }
            }
        }
        return topBird;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);


        bufferedReader.close();
    }
}
