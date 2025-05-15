package immutable;

import java.util.ArrayList;
import java.util.List;

public class ImmutableWithFactory {
    private final String name;
    private final int age;
    private final List<String> hobbies;

    private ImmutableWithFactory(String name, int age, List<String> hobbies) {
        this.age = age;
        this.name = name;
        this.hobbies = new ArrayList<>(hobbies);
    }

    public static ImmutableWithFactory of(String name, int age, List<String> hobbies) {
        return new ImmutableWithFactory(name,age,hobbies);
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }
}
