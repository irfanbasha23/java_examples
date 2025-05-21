package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringAndCollecting {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Irfan","Imthiyaz","Nayeem");
        List<String> filteredNames = list.stream().filter(name -> name.startsWith("I")).collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
