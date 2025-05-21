package dsandalgo;

import java.util.ArrayList;
import java.util.List;

public class MinMaxProblem {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);
        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int k = 4;
        long max = arr.get(0);
        long min = arr.get(0);
        long totalSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            totalSum += arr.get(i);
            if (arr.get(i) > max) {
                max = arr.get(i);
            } else if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        System.out.println((totalSum - max) + " " + (totalSum - min));
    }
}
