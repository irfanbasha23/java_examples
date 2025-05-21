package generics;

public class GenericMethodExample {

    public static <T> void printArray(T[] array) {
        for(T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String[] strArray = {"a","b","c","d"};
        Integer[] intArray = {1,2,3,4,5};
        printArray(strArray);
        printArray(intArray);
    }
}
