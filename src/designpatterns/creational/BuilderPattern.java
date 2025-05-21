package designpatterns.creational;

class User {
    private String name;
    private int age;

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    static class UserBuilder {
        private String name;
        private int age;

        public String setName(String name) {
            this.name = name;
            return this.name;
        }

        public int setAge(int age) {
            this.age = age;
            return this.age;
        }

        public User build() {
            return new User(this);
        }
    }
}


public class BuilderPattern {
    public static void main(String[] args) {
        User.UserBuilder builder = new User.UserBuilder();
        builder.setAge(1);
        builder.setName("abc");
        User user = builder.build();
    }
}
