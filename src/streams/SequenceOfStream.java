package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SequenceOfStream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,5,1,7,10);
        list.stream().
                filter(a -> a > 3).
                peek(a -> System.out.println("Filtering -> "+ a)).
                map(a -> a * -1).
                peek(a -> System.out.println("Negating -> "+ a)).
                sorted().
                peek(a -> System.out.println("Sorted -> "+ a)).collect(Collectors.toList());
    }
}
