package dsandalgo.sorting;

import java.util.Arrays;

public class _9JDKsSort {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        Arrays.sort(array);

        Arrays.parallelSort(array); // Divides the arrays into smaller sub array and sort parallelly using threads
        printArray(array);
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
