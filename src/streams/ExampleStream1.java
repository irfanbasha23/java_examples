package streams;

import java.util.Arrays;
import java.util.List;

public class ExampleStream1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1000,3000,4500,6000);
        long count = list.stream().filter(a -> a >3000).count();
        System.out.println("Total Salary grater than 3000 "+count);
    }
}
