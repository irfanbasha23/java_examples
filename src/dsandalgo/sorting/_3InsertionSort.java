package dsandalgo.sorting;

public class _3InsertionSort {

    public static void main(String[] args) {
        //int[] array = {20, 35, -15, 7, 55, 1, -22};
        int[] array = {18, 45, -15, 0, 10, -1, 38};
        if(array.length == 0) {

        }
        else if(array.length == 1) {
            System.out.println("Array is already sorted");
        } else {

            /**int firstUnSortedIndex = 1; //3
            int i = 0; // 2
            while(firstUnSortedIndex < array.length) {
                int newElement = array[firstUnSortedIndex]; // 7
                for(int j = i; j >= 0; j--) {
                    if(newElement < array[j]) {
                        array[j+1] = array[j];
                        if(j == 0) {
                            array[j] = newElement;
                            break;
                        }
                    } else {
                        array[j+1] = newElement;
                        break;
                    }
                }
                i++;
                firstUnSortedIndex++;
                //printArray(array);
            }**/
            for(int firstUnSortedIndex = 1; firstUnSortedIndex < array.length; firstUnSortedIndex++) {
                int newElement = array[firstUnSortedIndex];
                int i;
                for(i = firstUnSortedIndex; i > 0 && array[i-1] > newElement; i--) {
                    array[i] = array[i-1];
                }
                array[i] = newElement;
            }
        }
        printArray(array);


    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
