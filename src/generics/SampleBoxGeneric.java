package generics;

/**
 * Java Generics are a feature that allows you to define classes, interfaces, and methods with placeholder types, providing compile-time type safety and reducing the need for type casting. Generics enable you to write more flexible and reusable code while ensuring that type constraints are enforced at compile time.
 *
 * Key Differences between Generics and Raw Types
 * Type Safety:
 *
 * Generics provide compile-time type checking, which ensures that you use the correct types and reduces the risk of ClassCastException.
 * Raw types, on the other hand, bypass type checking, leading to potential runtime errors.
 * Code Reusability:
 *
 * Generics allow you to write a single class or method that works with different types, improving code reusability and maintainability.
 * Raw types are less flexible, often requiring duplicate code for different types.
 * Type Inference:
 *
 * With generics, the Java compiler can infer types, making the code cleaner and reducing the need for explicit casting.
 * Raw types require manual type casting, which is error-prone and less readable
 * @param <T>
 */
public class SampleBoxGeneric<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        SampleBoxGeneric<String> box1 = new SampleBoxGeneric<>();
        SampleBoxGeneric<Integer> box2 = new SampleBoxGeneric<>();
        box1.setValue("abc");
        box2.setValue(123);
        System.out.println(box1.getValue());
        System.out.println(box2.getValue());
    }
}