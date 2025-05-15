package streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepetitiveChar {

    public static void main(String[] args) {
        String input = "My name is Irfan";
        //input.chars().mapToObj(c -> (char)c).collect(Collectors.toList())
        Character a = input.chars().
                mapToObj(s -> Character.valueOf((char) s)).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(b -> b.getValue() == 1L).map(c -> c.getKey()).findFirst().get();
    }
}
