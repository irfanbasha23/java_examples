package immutable;

import java.util.ArrayList;
import java.util.List;

public final class Immutable {
    private final String name;
    private final int age;
    private final List<String> hobbies;
    public Immutable(int age, String name, List<String> hobbies) {
        this.age = age;
        this.name = name;
        this.hobbies = new ArrayList<>(hobbies);
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
