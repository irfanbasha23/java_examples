package dsandalgo.sorting;

public class _6QuickSort {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        quickSort(array, 0, array.length);
        printArray(array);
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void quickSort(int[] array, int start, int end) {
        if(end - start < 2) {
            return;
        }
        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex+1, end);
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int i = start;
        int j = end;
        while( i < j ) {
            // This is an empty loop, to identify the element that is less than or equals to pivot
            while(i < j && array[--j] <= pivot);
            if(i < j) {
                array[i] = array[j];
            }
            // same above empty
            while(i < j && array[++i] >= pivot);
            if(i < j) {
                array[j] = array[i];
            }
        }
        array[j] = pivot;
        return j;
    }
}
