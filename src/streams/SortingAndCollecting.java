package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingAndCollecting {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Irfan","Nayeem","Aiman");
        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
