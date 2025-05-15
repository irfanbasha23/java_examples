package dsandalgo.sorting;

public class _11InsertionSortRecursive {

    public static void main(String[] args) {
        //int[] array = {20, 35, -15, 7, 55, 1, -22};
        int[] array = {3, 1};
        //int[] array = {18, 45, -15, 0, 10, -1, 38};
        if(array.length == 1) {

        } else {
            insertion(array, 1);
        }
        printArray(array);
    }

    public static void insertion(int[] array, int firstUnSortedIndex) {
        if(firstUnSortedIndex == array.length) {
            return;
        }
        int newElement = array[firstUnSortedIndex];
        int i;
        for(i = firstUnSortedIndex; i > 0 && array[i-1] > newElement; i--) {
            array[i] = array[i-1];
        }
        array[i] = newElement;
        insertion(array, firstUnSortedIndex+1);
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
