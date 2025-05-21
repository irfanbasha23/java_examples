package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapping {

    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(Arrays.asList("Irfan","Aiman"),Arrays.asList("Sadaf","John"));
        List<String> finalList = listOfLists.stream().flatMap(List::stream).map(s -> s.toLowerCase()).collect(Collectors.toList());
        System.out.println(finalList);
    }
}
